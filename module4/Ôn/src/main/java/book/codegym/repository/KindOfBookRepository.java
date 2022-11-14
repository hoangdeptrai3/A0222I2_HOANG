package book.codegym.repository;

import book.codegym.model.KindOfBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KindOfBookRepository extends JpaRepository<KindOfBook, Long> {
}