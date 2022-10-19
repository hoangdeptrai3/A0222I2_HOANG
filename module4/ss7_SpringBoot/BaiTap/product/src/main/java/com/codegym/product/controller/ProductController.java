package com.codegym.product.controller;

import com.codegym.product.model.Product;
import com.codegym.product.service.IProductService;
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
    private IProductService productService;
    @Qualifier("productService")
    @GetMapping("")
    public  String listProduct(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public  String homeCreate(Model model){
        model.addAttribute("productList",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String addNew(Model model,@ModelAttribute("productList")Product product){
        productService.add(product);
        model.addAttribute("listProduct",productService.findAll());
        return "list";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id){
        productService.delete(id);
        model.addAttribute("listProduct",productService.findAll());
        return "list";
    }
}
