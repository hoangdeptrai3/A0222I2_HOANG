package com.example.phone.controller;

import com.example.phone.model.Book;
import com.example.phone.service.IBookService;
import com.example.phone.service.ILoaiSachService;
import jdk.internal.org.jline.terminal.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class BookController {
    @Autowired
    @Qualifier("book")
    private IBookService bookService;
    @Autowired
    @Qualifier("loaiSach")
    private ILoaiSachService loaiSachService;
    @GetMapping("/home")
    public String home(Model model, @RequestParam(value = "name",defaultValue = "")String name,
                       @PageableDefault(size = 4,sort = "name",direction = Sort.Direction.ASC)Pageable pageable){
        Page<Book> books = bookService.findAll(name, pageable);
        model.addAttribute("listBook",books);
        return "home";

    }
    @GetMapping("/create")
    public String homeCreate(Model model){
        model.addAttribute("listCreate",new Book());
        model.addAttribute("listLoaiSach",loaiSachService.findAll());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("listCreate")Book book, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("listLoaiSach",loaiSachService.findAll());
            return "create";
        }
        if (book.getId() == null){
            redirectAttributes.addAttribute("message","create succfully");
        }else {
            redirectAttributes.addAttribute("message","edit succfully");
        }
        bookService.save(book);
        return "redirect:/home";
    }
    @GetMapping("/book/{id}/edit")
    public String edit(@PathVariable("id")Long id, Model model){
        model.addAttribute("listCreate",bookService.findById(id));
        model.addAttribute("listLoaiSach",loaiSachService.findAll());
        return "create";
    }

    @GetMapping("/book/{id}/delete")
    public String delete(@PathVariable("id")Long id){
        bookService.delete(id);
        return "redirect:/home";
    }
    @PostMapping("/search")
    public String search(@RequestParam(value = "name" , defaultValue = "")String name,
                         @PageableDefault(size = 4, sort = "name" ,direction = Sort.Direction.ASC)Pageable pageable,Model model){
        model.addAttribute("listBook",bookService.findAll(name, pageable));
        return "home";

    }

}
