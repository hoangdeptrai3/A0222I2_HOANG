package com.example.phone.service;

import com.example.phone.dto.BookDTO;
import com.example.phone.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(String name, Pageable pageable);
    void save(Book book);
    Book findById(Long id);
    void delete(Long id);
    void addDTO(BookDTO book);
}
