package com.codegym.controller;

import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {
    @Autowired
    @Qualifier("musicService")
    private IMusicService musicService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("musicList",musicService.getAll());
        return "list";
    }
}
