package hoang.controller;

import hoang.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneManager {
    @GetMapping("")
    public  String showCreate(Model model){
        model.addAttribute("phone",new Phone());
        return "create";
    }
    @PostMapping("/add")
    public String submitAdd(Model model, @ModelAttribute("phone")Phone phone){
        model.addAttribute("id",phone.getId());
        model.addAttribute("name",phone.getName());
        model.addAttribute("manufacture",phone.getManufacture());
        return "home";
    }
}
