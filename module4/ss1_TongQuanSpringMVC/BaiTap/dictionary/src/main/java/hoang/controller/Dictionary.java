package hoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("")
    public String home(){
        return "homeDictionary";
    }

    @PostMapping("/test")
    public String display(Model model ,  String eng){
        String[] arr = {"hello",   "dog","cat","mother","brother","dragon","pig"};
        String[] kq =  {"xin chào","chó","mèo","mẹ",    "anh trai","rồng ","heo"};
         String result = "";
        for(int i = 0;i< arr.length && i< kq.length;i++){
            if (arr[i].equals(eng)){
                result = kq[i];
                break;
            }
        }
        model.addAttribute("eng",eng);
        model.addAttribute("vn",result);
        return "homeDictionary";
    }
}
