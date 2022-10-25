package com.codegym.demovalidate.service.impl;

import com.codegym.demovalidate.model.StudentValidate;
import com.codegym.demovalidate.repository.StudentValidateRepository;
import com.codegym.demovalidate.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentService implements IStudentService {
    @Autowired
    StudentValidateRepository studentValidateRepository;
    @Override
    public List<StudentValidate> findAll() {
        return studentValidateRepository.findAll();
    }

    @Override
    public void save(StudentValidate studentValidate) {
        studentValidateRepository.save(studentValidate);
    }
}
