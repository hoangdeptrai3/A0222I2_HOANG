package com.example.phone.repository;

import com.example.phone.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "select * from Book m where m.name like concat('%',:name,'%') ",
            nativeQuery = true ,
            countQuery = "select count('*') from (select * from Book m where m.name like concat('%',:name,'%')) m ")
    Page<Book> findAll(@Param("name")String name, Pageable page);
}