package com.example.demo4.controller;

import com.example.demo4.model.Car;
import com.example.demo4.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarColer {
    @Autowired
    private ICarService carService;
    @Qualifier("Car")
    @GetMapping("")
    public  String home(Model model){
        model.addAttribute("listCar",carService.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String homeCreate(Model model){
        model.addAttribute("carCreate",new Car());
        return "create";
    }
    @PostMapping("/create")
    public String addNew(Model model, @ModelAttribute("carCreate")Car car){
        carService.save(car);
        model.addAttribute("listCar",carService.findAll());
        return "home";
    }

    @GetMapping("/car/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id2){
        carService.delete(id2);
        model.addAttribute("listCar",carService.findAll());
        return "home";
    }
}
