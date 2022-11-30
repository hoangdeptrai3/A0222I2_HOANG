package com.example.mobile.controller;

import com.example.mobile.model.Phone;
import com.example.mobile.sẻvice.IKindPhoneService;
import com.example.mobile.sẻvice.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class Phonecontroller {
    @Autowired
    @Qualifier("phone")
    private IPhoneService phoneService;
    @Autowired
    @Qualifier("kindPhone")
    private IKindPhoneService kindPhoneService;

    @GetMapping("/home")
    public String home(@RequestParam(value = "name",defaultValue = "")String name,
                       @PageableDefault(size = 3,sort = "name",direction = Sort.Direction.ASC)Pageable pageable, Model model){
        model.addAttribute("listPhone",phoneService.findAll(name,pageable));
        return "home";


    }
    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("listCreate",new Phone());
        model.addAttribute("listKind",kindPhoneService.findALL());
        return "update";
    }
    @PostMapping("/create")
    public String update(@Valid @ModelAttribute("listCreate")Phone phone, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("listKind",kindPhoneService.findALL());
            return "update";
        }
        if (phone.getId() == null){
            redirectAttributes.addAttribute("message","create succfully");
        }else {
            redirectAttributes.addAttribute("message","edit succfully");
        }
        phoneService.save(phone);
        return "redirect:/home";
    }

    @GetMapping("/phone/{id}/edit")
    public String editHome(@PathVariable("id")Long id, Model model){
        model.addAttribute("listCreate",phoneService.findByid(id));
        model.addAttribute("listKind",kindPhoneService.findALL());
        return "update";
    }
    @PostMapping("/search")
    public String searchPhone(@RequestParam(value = "name",defaultValue = "")String name,
                              @PageableDefault(size = 3,sort = "name",direction = Sort.Direction.ASC)Pageable pageable,Model model){
        model.addAttribute("listPhone",phoneService.findAll(name,pageable));
        return "/home";
    }
    @GetMapping("/phone/{id}/delete")
    public String delete(@PathVariable("id")Long id){
        phoneService.delete(id);
        return "redirect:/home";
    }


}
