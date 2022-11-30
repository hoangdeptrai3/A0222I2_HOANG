package com.example.phone.service.impl;

import com.example.phone.dto.BookDTO;
import com.example.phone.model.Book;
import com.example.phone.model.LoaiSach;
import com.example.phone.repository.BookRepository;
import com.example.phone.repository.LoaiSachRepository;
import com.example.phone.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("book")
public class BookService implements IBookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private LoaiSachRepository loaiSachRepository;
    @Override
    public Page<Book> findAll(String name, Pageable pageable) {
        return bookRepository.findAll(name,pageable);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void addDTO(BookDTO book) {
        Book book1 = new Book();
        book1.setName(book.getName());
        book1.setPrice(book.getPrice());
        LoaiSach ls = loaiSachRepository.findById(book.getLoaiSach()).orElse(null);
        book1.setLoaiSach(ls);
        bookRepository.save(book1);
    }
}
