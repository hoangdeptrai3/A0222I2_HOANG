package hoang.codegym.controller;

import hoang.codegym.model.Phone;
import hoang.codegym.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class PhoneController {
    @Autowired
    private IPhoneService phoneService;
    @Qualifier("phoneService")
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("listPhone",phoneService.findAll());
        return "home";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("phoneList",new Phone());
        return "/create";
    }
    @PostMapping("/create")
        public String create(Model model, @ModelAttribute("phoneList")Phone phone){
        phoneService.save(phone);
        model.addAttribute("listPhone",phoneService.findAll());
            return "/home";
        }
    @GetMapping("/phone/{id}")
    public String delete(Model model, @PathVariable int id){
        phoneService.delete(id);
        model.addAttribute("listPhone",phoneService.findAll());
        return "home";
    }

    }

