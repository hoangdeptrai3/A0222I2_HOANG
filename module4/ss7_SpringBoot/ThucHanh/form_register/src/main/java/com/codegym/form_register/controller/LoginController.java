package com.codegym.form_register.controller;

import com.codegym.form_register.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {
    @GetMapping("")
    public String homeForm(Model model){
//        model.addAttribute("listLogin",new Login());
        return "home";
    }
    @GetMapping("/login")
    public String formLogin(Model model){
        model.addAttribute("list",new Login());
        return "login";
    }
    @PostMapping("/login")
    public String register(@Valid @ModelAttribute("list")Login login , BindingResult bindingResult,
                           Model model){
        if (bindingResult.hasErrors()){
            return "login";
        }
        model.addAttribute("msg","tạo tài khoản thành công");
        return "home";
    }
}
