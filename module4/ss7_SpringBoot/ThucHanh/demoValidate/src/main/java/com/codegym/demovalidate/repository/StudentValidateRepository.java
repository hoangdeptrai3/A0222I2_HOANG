package com.codegym.demovalidate.repository;

import com.codegym.demovalidate.model.StudentValidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentValidateRepository extends JpaRepository<StudentValidate, Long> {
}