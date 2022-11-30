package com.example.mobile.repository;

import com.example.mobile.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    @Query(value = "select * from Phone m where m.name like concat('%',:name,'%') ",
            nativeQuery = true ,
            countQuery = "select count('*') from (select * from Phone m where m.name like concat('%',:name,'%')) m ")
    Page<Phone> findAll(@Param("name")String name, Pageable page);
}