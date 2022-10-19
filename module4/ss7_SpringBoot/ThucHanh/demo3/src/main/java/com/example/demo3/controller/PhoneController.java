package com.example.demo3.controller;

import com.example.demo3.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneController {
    @Autowired
    private IPhoneService phoneService;

    @Qualifier("phone")
    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("phoneList", phoneService.findAll());
        return "home";
    }
}
