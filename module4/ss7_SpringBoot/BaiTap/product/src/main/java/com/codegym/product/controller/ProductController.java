package com.codegym.product.controller;

import com.codegym.product.model.Product;
import com.codegym.product.service.IProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("list-page")
    public String productPage(@RequestParam(value = "page",defaultValue = "0")int page,Model model){
        Page<Product> productPage = productService.findAll(PageRequest.of(page,2));
        model.addAttribute("productPage",productPage);
        return "listPage";
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
    @GetMapping("/search")
    public String searchName(Model model,@RequestParam("id")Long id){
        model.addAttribute("listProduct",productService.search(id));
        return "list";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id){
        productService.delete(id);
        model.addAttribute("listProduct",productService.findAll());
        return "list";
    }
    @GetMapping("/product/{id}/edit")
    public String editHome(Model model){
        model.addAttribute("listEdit",new Product());
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(Model model,@PathVariable("id")Long id){
        productService.edit(id);
        model.addAttribute("listProduct",productService.findAll());
        return "list";
    }
}
