package book.codegym.controller;

import book.codegym.dto.BookDTO;
import book.codegym.model.Book;
import book.codegym.service.IBookService;
import book.codegym.service.IKindOfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
//@CrossOrigin("*")
@RequestMapping("rest")
public class BookRestController {
    @Autowired
    @Qualifier("bookService")
    private IBookService bookService;


    @Autowired
    private IKindOfBookService kindOfBookService;
//    list UI
    @GetMapping("")
    public ModelAndView getHome(){
        return new ModelAndView("home", "bookList", bookService.findAll());
    }

//    list test posman
    @GetMapping("HOME")
    public List<Book> getHome2(){
        return  bookService.findAll();
    }

//    tra ve from create
    @GetMapping("/create")
    public ModelAndView homeCreate(){
        return new ModelAndView("create_ajax","kindBook",kindOfBookService.findAll());
    }

//    them book
    @PostMapping("/create")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO book){
        bookService.addDTO(book);
        return new ResponseEntity<>(book,HttpStatus.CREATED);
    }
}
