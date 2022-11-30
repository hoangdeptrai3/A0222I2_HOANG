package com.example.shop.controller;

import com.example.shop.model.GiaoDich;
import com.example.shop.service.IGiaoDichService;
import com.example.shop.service.IKhachHangService;
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
public class GiaoDichController {
    @Autowired
    @Qualifier("giaodich")
    private IGiaoDichService giaoDichService;

    @Autowired
    @Qualifier("khachhang")
    private IKhachHangService khachHangService;

    @GetMapping("/home")
    public String home(@RequestParam(value = "name",defaultValue = "")String name,
                       @PageableDefault(size = 3,sort = "name",direction = Sort.Direction.ASC)Pageable pageable,
                       Model model){
        model.addAttribute("listGD",giaoDichService.findAll(name, pageable));
        return "home";
    }
    @GetMapping("/create")
    public String homeCreate(Model model){
        model.addAttribute("listCreate",new GiaoDich());
        model.addAttribute("listKH",khachHangService.findAll());
        return "update";
    }
    @PostMapping("/create")
    public String updateDB(@Valid @ModelAttribute("listCreate")GiaoDich giaoDich, BindingResult result, RedirectAttributes redirectAttributes, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listKH", khachHangService.findAll());
            return "update";
        }
        if (giaoDich.getId() == null) {
            redirectAttributes.addFlashAttribute("message", "create ok");
        } else {
            redirectAttributes.addFlashAttribute("message", "edit ok");
        }
        giaoDichService.save(giaoDich);
        return "redirect:/home";
    }
    @GetMapping("/giaodich/{id}/delete")
    public String delete(@PathVariable("id")Long id, Model model){
       giaoDichService.delete(id);
       return "redirect:/home";
    }
    @GetMapping("/giaodich/{id}/edit")
    public String edit(@PathVariable("id")Long id,Model model){
        model.addAttribute("listCreate",giaoDichService.edit(id));
        model.addAttribute("listKH",khachHangService.findAll());
        return "update";
    }
    @PostMapping("/search")
    public String search(Model model,@RequestParam(value = "name", defaultValue = "") String name,
                         @PageableDefault(size = 3, sort = "name", direction = Sort.Direction.ASC) Pageable pageable){
        model.addAttribute("listGD",giaoDichService.(name,pageable));
        return "home";
    }


}
