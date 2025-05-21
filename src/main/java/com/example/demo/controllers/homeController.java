package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class homeController {
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("title","Главная страничка.");
        return  "home";
    }
}
