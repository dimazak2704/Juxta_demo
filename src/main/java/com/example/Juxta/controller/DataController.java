package com.example.Juxta.controller;

import com.example.Juxta.model.DataRun;
import com.example.Juxta.model.DataSubmit;
import com.example.Juxta.model.Data;
import com.example.Juxta.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/juxta")
public class DataController {
    private static Data localData;
    private final DataService dataCheckingDAO;
    @Autowired
    public DataController(DataService dataCheckingDAO) {
        this.dataCheckingDAO = dataCheckingDAO;
    }

    @GetMapping()
    public String start_demo_page (Model model) {
        model.addAttribute("data", new Data());
        return "demo/index";
    }

    @ResponseBody
    @GetMapping("/run")
    public List<DataRun> run_result_page () {
        return dataCheckingDAO.dataForRunChecking(localData);
    }
    @PostMapping("/run")
    public String post_run_result_page (@ModelAttribute("data") Data data) {
        localData = data;
        return "redirect:/juxta/run";
    }

    @ResponseBody
    @GetMapping("/submit")
    public List<DataSubmit> submit_result_page () {
        return dataCheckingDAO.dataForSubmitChecking(localData);
    }
    @PostMapping("/submit")
    public String post_submit_result_page (@ModelAttribute("data") Data data) {
        localData = data;
        return "redirect:/juxta/submit";
    }
}
