package com.example.demo.controller;

import com.example.demo.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneController {
    @Autowired
    private IPhoneService phoneService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("listPhone",phoneService.findAll());
        return "list";
    }
}
