package com.example.demo.controller;

import com.example.demo.model.Phone;
import com.example.demo.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
public class PhoneController {
    @Autowired
    @Qualifier("phone")
    private IPhoneService phoneService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("listPhone",phoneService.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("createPhone",new Phone());
        return "update";
    }
    @PostMapping("/create")
    public String create(Model model,@ModelAttribute("createPhone")Phone phone){
        phoneService.save(phone);
        model.addAttribute("listPhone",phoneService.findAll());
        return "redirect:/home";
    }
    @GetMapping("/phone/{id}/edit")
    public String editHome(Model model, @PathVariable("id")Long id){
        model.addAttribute("createPhone", phoneService.edit(id));
        return "update";
    }
    @GetMapping("/phone/{id}/delete")
    public String deletePhone(Model model,@PathVariable("id")Long id){
        phoneService.delete(id);
        model.addAttribute("listPhone",phoneService.findAll());
        return "home";
    }
    @GetMapping("/search")
    public String search(Model model, @RequestParam("name")String name){
        model.addAttribute("listPhone",phoneService.search(name));
        return "home";
    }
}
