package com.codegym.form_register.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Table(name = "login")
@Entity(name = "login")
@Setter
@Getter
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull(message = "Name không được để null")
    @NotBlank(message = "name là một ký tự chuỗi ")
    @NotEmpty(message = "name không được để trống")
    @Column(name ="name")
    private String name;
    @Min(18)
    @Column(name = "age")
    private Integer age;
    @Email
    @Column(name = "email")
    private String email;

}