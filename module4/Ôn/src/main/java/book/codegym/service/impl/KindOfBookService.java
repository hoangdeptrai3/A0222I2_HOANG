package book.codegym.service.impl;

import book.codegym.model.KindOfBook;
import book.codegym.repository.KindOfBookRepository;
import book.codegym.service.IKindOfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KindOfBookService implements IKindOfBookService {
    @Autowired
    private KindOfBookRepository kindOfBookRepository;
    @Override
    public List<KindOfBook> findAll() {
        return kindOfBookRepository.findAll();
    }
}
