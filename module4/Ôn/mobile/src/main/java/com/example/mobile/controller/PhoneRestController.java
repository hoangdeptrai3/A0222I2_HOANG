package com.example.mobile.controller;

import com.example.mobile.DTO.PhoneDTO;
import com.example.mobile.sẻvice.IKindPhoneService;
import com.example.mobile.sẻvice.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("rest")
public class PhoneRestController {
    @Autowired
    @Qualifier("phone")
    private IPhoneService phoneService;
    @Autowired
    @Qualifier("kindPhone")
    private IKindPhoneService kindPhoneService;
    @GetMapping("")
    public ModelAndView getHome(@RequestParam(value = "name" ,defaultValue = "")String name,
                                @PageableDefault(size = 3,sort = "name",direction = Sort.Direction.ASC) Pageable pageable){
        return new ModelAndView("home", "phoneList", phoneService.findAll(name,pageable));
    }
    @GetMapping("/create")
    public ModelAndView homeCreate(){
        return new ModelAndView("create_jax","kindPhone",kindPhoneService.findALL());
    }
    @PostMapping("/create")
    public ResponseEntity<PhoneDTO> addBook(@RequestBody PhoneDTO phone){
        phoneService.save_ajax(phone);
        return new ResponseEntity<>(phone, HttpStatus.CREATED);
    }
}
