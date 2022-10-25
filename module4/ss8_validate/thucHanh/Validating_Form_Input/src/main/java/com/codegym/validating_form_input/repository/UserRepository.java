package com.codegym.validating_form_input.repository;

import com.codegym.validating_form_input.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}