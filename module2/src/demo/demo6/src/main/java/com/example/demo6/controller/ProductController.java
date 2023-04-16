package com.example.demo6.controller;

import com.example.demo6.model.Product;
import com.example.demo6.service.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private IProduct product;
    @Qualifier("product")
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("listProduct",product.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("createProduct",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String createP(@ModelAttribute("createProduct")Product p,Model model){
        product.save(p);
        model.addAttribute("listProduct",product.findAll());
        return "home";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id){
        product.delete(id);
        model.addAttribute("listProduct",product.findAll());
        return "home";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(Model model,@PathVariable("id")Long id){
        model.addAttribute("createProduct",product.findByID(id));
        return "create";
    }
}
