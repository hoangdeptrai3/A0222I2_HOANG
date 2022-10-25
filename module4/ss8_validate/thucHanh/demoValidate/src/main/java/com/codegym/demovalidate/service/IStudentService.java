package com.codegym.demovalidate.service;

import com.codegym.demovalidate.model.StudentValidate;
import com.codegym.demovalidate.repository.StudentValidateRepository;

import java.util.List;

public interface IStudentService {
    public List<StudentValidate> findAll();
   public void save(StudentValidate studentValidate);


}
