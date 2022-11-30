package com.example.shop.repository;

import com.example.shop.model.GiaoDich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GiaoDichRepository extends JpaRepository<GiaoDich, Long> {
    @Query(value = "select * from giao_dich m where m.name like concat('%',:name,'%') ",
            nativeQuery = true ,
            countQuery = "select count('*') from (select * from giao_dich m where m.name like concat('%',:name,'%')) m ")
    Page<GiaoDich> findAll(@Param("name")String name, Pageable page);
    Page<GiaoDich> findByKhachHangContains(Pageable pageable);
}