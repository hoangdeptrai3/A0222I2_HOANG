package hoang.codegym.controller;

import hoang.codegym.model.Product;
import hoang.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @Qualifier("serviceProduct")
    @GetMapping("")
    public String homeList(Model model){
        model.addAttribute("listProduct",productService.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("listCreate",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String addHome(Model model, @ModelAttribute("listCreate")Product product){
        productService.save(product);
        model.addAttribute("listProduct",productService.findAll());
        return "home";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(Model model, @PathVariable int id){
        productService.delete(id);
        model.addAttribute("listProduct",productService.findAll());
        return "home";
    }

    @GetMapping("/product/{id}/edit")
    public String showFormEdit(Model model){
        model.addAttribute("editList",new Product());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Model model,@PathVariable("id")Integer id){
        model.addAttribute("listProduct", productService.edit(id));
        return "home";
    }

    @GetMapping("/search")
    public String searchName(Model model, @RequestParam("search") String name){
        model.addAttribute("listProduct",productService.findbyName(name));
        return "home";
    }

}
