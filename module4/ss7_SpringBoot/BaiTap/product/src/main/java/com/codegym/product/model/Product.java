package com.codegym.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "manufacturer")
    private String manufacturer;

}