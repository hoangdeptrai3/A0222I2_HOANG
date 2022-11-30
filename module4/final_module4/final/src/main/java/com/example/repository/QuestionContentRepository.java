package com.example.repository;

import com.example.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionContentRepository extends JpaRepository<QuestionContent, Long> {

    @Query(value = "select * from question_content m where m.title like concat('%',:title,'%') ",
            nativeQuery = true ,
            countQuery = "select count('*') from (select * from question_content m where m.title like concat('%',:title,'%')) m ")
    Page<QuestionContent> findAll(@Param("title")String title, Pageable page);
}