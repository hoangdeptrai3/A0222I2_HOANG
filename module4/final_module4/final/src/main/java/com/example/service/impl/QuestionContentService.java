package com.example.service.impl;

import com.example.model.QuestionContent;
import com.example.repository.QuestionContentRepository;
import com.example.service.IQuestionContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("content")
public class QuestionContentService implements IQuestionContent {
    @Autowired
    private QuestionContentRepository questionContentRepository;


//    @Override
//    public List<QuestionContent> findAll() {
//        return questionContentRepository.findAll();
//    }

    @Override
    public Page<QuestionContent> findAll(String status, Pageable pageable) {
        return questionContentRepository.findAll(status,pageable);
    }

    @Override
    public void save(QuestionContent questionContent) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public QuestionContent findbyid(Long id) {
        return null;
    }
}
