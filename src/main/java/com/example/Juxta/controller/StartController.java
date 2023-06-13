package com.example.Juxta.controller;

import com.example.Juxta.model.DataAfterRunChecking;
import com.example.Juxta.model.DataAfterSubmitChecking;
import com.example.Juxta.model.DataBeforeChecking;
import com.example.Juxta.service.DataCheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/juxta")
public class StartController {
    private static DataBeforeChecking dataBCh;
    private final DataCheckingService dataCheckingDAO;
    @Autowired
    public StartController(DataCheckingService dataCheckingDAO) {
        this.dataCheckingDAO = dataCheckingDAO;
    }

    @GetMapping()
    public String start_demo_page (Model model) {
        model.addAttribute("data", new DataBeforeChecking());
        return "demo/page";
    }

    @PostMapping("/run")
    public String post_run_result_page (@ModelAttribute("data") DataBeforeChecking data) {
        dataBCh = data;
        return "redirect:/juxta/run";
    }
    @ResponseBody
    @GetMapping("/run")
    public List<DataAfterRunChecking> run_result_page () {
        return dataCheckingDAO.dataForRunChecking(dataBCh);
    }

    @PostMapping("/submit")
    public String post_submit_result_page (@ModelAttribute("data") DataBeforeChecking data) {
        dataBCh = data;
        return "redirect:/juxta/submit";
    }
    @ResponseBody
    @GetMapping("/submit")
    public List<DataAfterSubmitChecking> submit_result_page () {
        return dataCheckingDAO.dataForSubmitChecking(dataBCh);
    }

    @GetMapping("/new")
    public String newJson(Model model) {
        model.addAttribute("json", new DataAfterRunChecking());
        return "/juxta/submit";
    }

    @PostMapping("/all")
    public String jsonPost(@ModelAttribute("json") DataAfterRunChecking dataAfterRunChecking) {
        dataCheckingDAO.save(dataAfterRunChecking);
        return "redirect:/juxta/all";
    }

    @ResponseBody
    @GetMapping("/all")
    public List<DataAfterRunChecking> showJson() {
        return dataCheckingDAO.all();
    }

    @GetMapping("/photo")
    public String photo() {
        return "/demo/photo";
    }
}
