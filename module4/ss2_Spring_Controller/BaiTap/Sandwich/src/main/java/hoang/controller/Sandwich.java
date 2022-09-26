package hoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class Sandwich {
    @GetMapping("")
    public String home(){
        return "home";
    }
    @PostMapping("/test")
    public String sandwich(Model model,@RequestParam("a") String[] a)
    {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,a);
        model.addAttribute("result",list);
      return "home";
    }
}
