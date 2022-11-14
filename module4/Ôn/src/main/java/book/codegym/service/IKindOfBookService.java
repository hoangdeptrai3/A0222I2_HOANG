package book.codegym.service;

import book.codegym.model.KindOfBook;

import java.util.List;

public interface IKindOfBookService {
    List<KindOfBook> findAll();
}
