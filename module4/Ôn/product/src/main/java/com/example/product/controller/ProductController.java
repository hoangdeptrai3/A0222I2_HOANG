package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ICategoryService;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    @Qualifier("product")
    private IProductService productService;
    @Autowired
    @Qualifier("category")
    private ICategoryService categoryService;

    @GetMapping("/home")
    public String home(Model model,@RequestParam(value = "name", defaultValue = "")String name,
                       @PageableDefault(size = 4, sort = "name", direction = Sort.Direction.ASC)Pageable pageable){
        Page<Product> products = productService.findAll(name,pageable);
        model.addAttribute("listProduct",products);
        return "home";
    }


    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("listCreate",new Product());
        model.addAttribute("listCategory",categoryService.findAll());
        return "create";
    }
//    @PostMapping("/create")
//    public String createNew(Model model, @ModelAttribute("listCreate")Product product, RedirectAttributes redirectAttributes){
//        model.addAttribute("listProduct",categoryService.findAll());
//        productService.save(product);
//        return "redirect:/home";
//    }
    @GetMapping("/product/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id){
        productService.delete(id);
        return "redirect:/home";
    }
    @PostMapping("/search")
    public String search(Model model,@RequestParam(value = "name", defaultValue = "") String name,
                         @PageableDefault(size = 5, sort = "name", direction = Sort.Direction.ASC) Pageable pageable){
        model.addAttribute("listProduct",productService.findAll(name,pageable));
        return "home";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable("id")Long id,Model model){
        model.addAttribute("listCreate",productService.findbyid(id));
        model.addAttribute("listCategory",categoryService.findAll());
        return "create";
    }
    @PostMapping("/create")
    public String updateDB(@Valid @ModelAttribute("listCreate") Product product, BindingResult result, RedirectAttributes redirectAttributes, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listCategory", categoryService.findAll());
            return "create";
        }
        if (product.getId() == null) {
            redirectAttributes.addFlashAttribute("message", "create ok");
        } else {
            redirectAttributes.addFlashAttribute("message", "edit ok");
        }
        productService.save(product);
        return "redirect:/home";
    }



}
