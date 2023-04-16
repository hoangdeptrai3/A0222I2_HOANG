package demo.demo999.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import demo.demo999.model.Phone;
import demo.demo999.service.IphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneController {
    @Autowired
    @Qualifier("phone")
    private IphoneService iphoneService;
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("listPhone",iphoneService.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("createPhone",new Phone());
        return "create";
    }
    @PostMapping("/create")
    public String create(Model model, @ModelAttribute("createPhone")Phone phone){
        iphoneService.save(phone);
        model.addAttribute("listPhone",iphoneService.findAll());
        return "home";
    }
    @GetMapping("/phone/{id}/delete")
    public String delete(Model model, @PathVariable("id")Long id){
        iphoneService.delete(id);
        model.addAttribute("listPhone",iphoneService.findAll());
        return "home";
    }
    @GetMapping("/phone/{id}/edit")
    public String edit(Model model,@PathVariable("id")Long id){

        model.addAttribute("createPhone",iphoneService.findByID(id));
        return "create";
    }
}
