package com.ngle.borrower2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/api/main")
    public String main(){
        return "index";
    }


}
