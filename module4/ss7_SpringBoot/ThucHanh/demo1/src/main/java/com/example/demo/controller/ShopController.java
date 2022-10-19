package com.example.demo.controller;

import com.example.demo.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @Autowired
    private IShopService shopService;
    @Qualifier("shop")
    @GetMapping("")
    public  String homeShow(Model model){
        model.addAttribute("shopList",shopService.findAll());
        return "home";
    }
}
