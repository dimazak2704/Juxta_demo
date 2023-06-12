package com.example.Juxta.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JuxtaController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
