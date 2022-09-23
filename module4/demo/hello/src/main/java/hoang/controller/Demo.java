package hoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Demo {
    @GetMapping("")
    public String greeting(Model model,@RequestParam String name,@RequestParam Integer id){
        System.out.println(id);
        System.out.println(name);
        model.addAttribute("name","hello");
        return "vip";
    }
        @RequestMapping(value = "/hello",method = RequestMethod.GET)
        public String hello(){
            return "index";
        }
}
