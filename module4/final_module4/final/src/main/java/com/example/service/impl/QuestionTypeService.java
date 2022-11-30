package com.example.service.impl;

import com.example.model.QuestionType;
import com.example.repository.QuestionTypeRepository;
import com.example.service.IQuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("type")
public class QuestionTypeService implements IQuestionType {
    @Autowired
    private QuestionTypeRepository questionTypeRepository;
    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}
