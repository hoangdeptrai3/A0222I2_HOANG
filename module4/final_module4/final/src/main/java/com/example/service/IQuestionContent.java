package com.example.service;

import com.example.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IQuestionContent {
    Page<QuestionContent> findAll(String name, Pageable pageable);
//    List<QuestionContent> findAll();
    void save(QuestionContent questionContent);
    void delete(Long id);
    QuestionContent findbyid(Long id);
}
