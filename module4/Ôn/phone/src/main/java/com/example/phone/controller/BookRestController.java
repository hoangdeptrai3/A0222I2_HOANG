package com.example.phone.controller;

import com.example.phone.dto.BookDTO;
import com.example.phone.repository.BookRepository;
import com.example.phone.service.IBookService;
import com.example.phone.service.ILoaiSachService;
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
public class BookRestController {
    @Autowired
    @Qualifier("book")
    private IBookService bookService;
    @Autowired
    @Qualifier("loaiSach")
    private ILoaiSachService loaiSachService;
    @GetMapping("")
    public ModelAndView getHome(@RequestParam(value = "name" ,defaultValue = "")String name,
                                @PageableDefault(size = 3,sort = "name",direction = Sort.Direction.ASC)Pageable pageable){
        return new ModelAndView("home", "bookList", bookService.findAll(name,pageable));
    }
    @GetMapping("/create")
    public ModelAndView homeCreate(){
        return new ModelAndView("create_Ajax","loaiSach",loaiSachService.findAll());
    }
    @PostMapping("/create")
    public ResponseEntity<BookDTO> addBook(@RequestBody BookDTO book){
        bookService.addDTO(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
