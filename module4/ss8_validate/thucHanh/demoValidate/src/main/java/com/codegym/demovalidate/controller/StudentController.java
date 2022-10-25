package com.codegym.demovalidate.controller;

import com.codegym.demovalidate.model.StudentValidate;
import com.codegym.demovalidate.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @Qualifier("studentService")
    @GetMapping("")
    public String homeForm(Model model){
        model.addAttribute("listStudent",studentService.findAll());
        return "list";
    }
    @GetMapping("create")
    public String homeCreate(Model model){
        model.addAttribute("createStudent",new StudentValidate());
        return "create";
    }
    @PostMapping("/create")
    public String createNew(@Valid  @ModelAttribute("createStudent") StudentValidate studentValidate,
                            BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            return "create";
        }
        studentService.save(studentValidate);
        model.addAttribute("msg","thêm thành công");
        model.addAttribute("listStudent",studentService.findAll());
        return "list";
    }

}
