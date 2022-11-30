package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from Product m where m.name like concat('%',:name,'%') ",
            nativeQuery = true ,
            countQuery = "select count('*') from (select * from Product m where m.name like concat('%',:name,'%')) m ")
    Page<Product> findAll(@Param("name")String name, Pageable page);
}