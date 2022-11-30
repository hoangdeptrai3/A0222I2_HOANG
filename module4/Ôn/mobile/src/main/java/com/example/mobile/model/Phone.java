package com.example.mobile.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Table(name = "phone")
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "phai la chuoi")
    @NotEmpty(message = "ko dc de trong")
    @Pattern(regexp = "^[A-Za-z ]+$",message = "phải là chữ")
    @Column(name = "name")
    private String name;
    @Min(200)
    @NotEmpty(message = "ko dc de trống")
    @Column(name = "price")
    private Long price;
    @ManyToOne
    @JoinColumn(name = "xach_tay")
    public KindPhone kindPhone;

    public Phone() {
    }

    public Phone(Long id, String name, Long price, KindPhone kindPhone) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.kindPhone = kindPhone;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public KindPhone getKindPhone() {
        return kindPhone;
    }

    public void setKindPhone(KindPhone kindPhone) {
        this.kindPhone = kindPhone;
    }
}