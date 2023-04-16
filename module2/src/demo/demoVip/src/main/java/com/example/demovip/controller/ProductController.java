package com.example.demovip.controller;

import com.example.demovip.model.Product;
import com.example.demovip.service.ProductService;
import com.example.demovip.service.impl.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    @Qualifier("product")
    private IproductService productService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("listCreate",new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(Model model, @ModelAttribute("listCreate")Product product){
        productService.save(product);
        model.addAttribute("listProduct",productService.findAll());
        return "index";
    }
    @GetMapping("/product/{id}/delete")
    public String deleteP(Model model, @PathVariable("id")Long id){
        productService.delete(id);
        model.addAttribute("listProduct",productService.findAll());
        return "index";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(Model model,@PathVariable("id")Long id){
        model.addAttribute("listCreate",productService.edit(id));
        return "create";
    }
    @GetMapping("/search")
    public String search(Model model, @RequestParam("product")String name){
        model.addAttribute("listProduct",productService.search(name));
        return "index";
    }
}

