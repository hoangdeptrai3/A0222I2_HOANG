package com.example.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Table(name = "product")
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull(message = "trường name ko dc để null")
    @NotBlank(message = "name phải là ký tự chuỗi")
    @NotEmpty(message = "name ko dc de trong ")
    @Column(name = "name")
    @Pattern(regexp = "^[A-Za-z ]+$")
    private String name;
    @NotNull(message = "ko dc de trong")
    @Min(1000)
    @Column(name = "price")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "category" ,nullable = false, referencedColumnName = "id")
    private Category categoryP;
    public Product(){

    }

    public Product(Long id, String name, Integer price, Category categoryP) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryP = categoryP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Category getCategoryP() {
        return categoryP;
    }

    public void setCategoryP(Category categoryP) {
        this.categoryP = categoryP;
    }
}