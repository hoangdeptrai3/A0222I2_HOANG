package hoang.controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerFormBinding {
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }
    @PostMapping("/add")
    public String addEmployee(Model model, @ModelAttribute("employee")Employee employee ){
        model.addAttribute("id",employee.getId());
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        return "home";
    }
}
