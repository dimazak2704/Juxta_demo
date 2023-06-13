package com.example.Juxta.controller;

import com.example.Juxta.model.DataRun;
import com.example.Juxta.model.DataSubmit;
import com.example.Juxta.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/juxta")
public class DataController {
    private static String input, code;
    private final DataService dataCheckingDAO;
    @Autowired
    public DataController(DataService dataCheckingDAO) {
        this.dataCheckingDAO = dataCheckingDAO;
    }

    @GetMapping()
    public String start_demo_page (@ModelAttribute("input") String input,
                                   @ModelAttribute("code") String code) {
        return "index";
    }


    @PostMapping("/run")
    public String post_run_result_page (@RequestParam("input") String input,
                                        @RequestParam("code") String code) {
        DataController.code = code;
        DataController.input = input;
        return "redirect:/juxta/run";
    }
    @ResponseBody
    @GetMapping("/run")
    public List<DataRun> run_result_page () {
        return dataCheckingDAO.dataForRunChecking(code, input);
    }


    @PostMapping("/submit")
    public String post_submit_result_page (@RequestParam("code") String code) {
        DataController.code = code;
        return "redirect:/juxta/submit";
    }
    @ResponseBody
    @GetMapping("/submit")
    public List<DataSubmit> submit_result_page () {
        return dataCheckingDAO.dataForSubmitChecking(code);
    }


    ////// test photo page /////
    @GetMapping("/photo")
    public String pig () {
        return "photo";
    }

    ////// test page /////
    @GetMapping("/page")
    public String test (@ModelAttribute("input") String input,
                        @ModelAttribute("code") String code) {
        return "test";
    }
}
