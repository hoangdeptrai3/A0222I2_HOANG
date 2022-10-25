package com.codegym.demovalidate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "student_validate")
@Entity(name = "studentValidate")
@Getter
@Setter
public class StudentValidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotEmpty(message = "name ko dc de trong(not empty")
    @NotNull(message = "name không được để trống (not null) ")
    @NotBlank(message = "name không được để trống(not blank")

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;


}