package com.example.controller;

import com.example.model.QuestionContent;
import com.example.service.IQuestionContent;
import com.example.service.IQuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionController {
    @Autowired
    @Qualifier("content")
    private IQuestionContent questionContent;

    @Autowired
    @Qualifier("type")
    private IQuestionType questionType;

    @GetMapping("/home")
    public String home(@RequestParam(value = "status",defaultValue = "")String status,
                       @PageableDefault(size = 3,sort = "status",direction = Sort.Direction.ASC)Pageable pageable, Model model){
        Page<QuestionContent> q = questionContent.findAll(status, pageable);
        model.addAttribute("listQuestion",q);
        return "home";
    }

    @PostMapping("/search")
    public String searchHome(@RequestParam(value = "name",defaultValue = "")String name,
                       @PageableDefault(size = 3,sort = "status",direction = Sort.Direction.ASC)Pageable pageable,Model model){
        model.addAttribute("listQuestion",questionContent.findAll(name,pageable));
        return "home";
    }

//    @GetMapping("/home")
//    public String home(Model model){
//        model.addAttribute("listQuestion",questionContent.findAll());
//        return "home";
//    }
}
