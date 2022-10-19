package com.example.demo4.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "car")
@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;

}