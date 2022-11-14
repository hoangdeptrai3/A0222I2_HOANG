package book.codegym.service;

import book.codegym.dto.BookDTO;
import book.codegym.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void add(Book book);
    void delete(Long id);
    List<Book> search(String name);
    void edit(Book book);

    void addDTO(BookDTO book);
}
