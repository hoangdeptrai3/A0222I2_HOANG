package com.example.demo3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "phone")
@Entity(name = "phone")
@Getter
@Setter
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "manufacturer")
    private String manufacturer;

}