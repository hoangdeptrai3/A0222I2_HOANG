package com.codegym.form_register.repository;

import com.codegym.form_register.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}