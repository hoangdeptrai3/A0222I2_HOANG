package book.codegym.controller;

import book.codegym.model.Book;
import book.codegym.service.IBookService;
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
@RequestMapping("rest")
public class BookRestController {
    @Autowired
    private IBookService bookService;
    @Qualifier("bookService")

//    public ModelAndView getHome(){
//        return new ModelAndView("home", "bookList", bookService.findAll());
//    }

//    public List<Book> getHome(){
//        return  bookService.findAll();
//    }
    @GetMapping("/home")
    public ResponseEntity<List<Book>> getHome(){
        try{
            List<Book> bookList = bookService.findAll();
            if (bookList.size() == 0){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bookList,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/create")
    public ResponseEntity<?> addBook(@RequestBody Book book){
        bookService.add(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
