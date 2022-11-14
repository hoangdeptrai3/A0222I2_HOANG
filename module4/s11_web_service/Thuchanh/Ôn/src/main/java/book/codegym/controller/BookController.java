package book.codegym.controller;

import book.codegym.model.Book;
import book.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Qualifier("bookService")
    @GetMapping("")
    public String homeBook(Model model){
        model.addAttribute("bookList",bookService.findAll());
        return "home";
    }
    @GetMapping("/create")
    public String homeCreate(Model model){
        model.addAttribute("createBook",new Book());
        return "create";
    }
    @PostMapping("/create")
    public String addBook(Model model, @ModelAttribute("createBook")Book book){
        bookService.add(book);
        model.addAttribute("bookList",bookService.findAll());
        return "home";
    }
    @PostMapping("/delete")
    public String delete(Model model, @RequestParam("idDelete")Long id){
        bookService.delete(id);
        model.addAttribute("bookList",bookService.findAll());
        return "home";
    }
    @PostMapping("/search")
    public String search(Model model,@RequestParam("name")String name){
        model.addAttribute("bookList",bookService.search(name));
        return "home";
    }
    @GetMapping("/book/{id}/edit")
    public String updateHomek(Model model){
        model.addAttribute("editBook",new Book());
        return "edit";
    }
    @PostMapping("/edit")
    public String updateBook(Model model,@ModelAttribute("editBook")Book book){
        bookService.edit(book);
        model.addAttribute("bookList",bookService.findAll());
        return "home";
    }

}
