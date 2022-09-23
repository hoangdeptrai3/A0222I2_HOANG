package hoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculate {

@GetMapping("/a")
public String home(){
    return "home";
}

    @PostMapping("/test")
    public String calculate(Model model,  float a){
        float result = 23000* a;
//        float result = 23000* Float.parseFloat(ip);
        model.addAttribute("input",a);
        model.addAttribute("result",result);
        return "home";
    }
}
