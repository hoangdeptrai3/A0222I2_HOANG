package book.codegym.service.impl;

import book.codegym.model.Book;
import book.codegym.repository.BookRepository;
import book.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("bookService")
public class BookService implements IBookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> search(String name) {
        List<Book> bookList = new ArrayList<>();
        for(Book book : bookRepository.findAll()){
            if (book.getName().equals(name)){
                bookList.add(book);
            }
        }
        return bookList;
    }

    @Override
    public void edit(Book book) {
        bookRepository.save(book);
    }
}
