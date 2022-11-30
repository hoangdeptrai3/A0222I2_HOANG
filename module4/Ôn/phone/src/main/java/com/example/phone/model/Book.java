package com.example.phone.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Table(name = "book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull(message = "name ko dc de null")
    @NotBlank(message = "phai la ky tu chuoi")
    @NotEmpty(message = "khong được để trống")
    @Pattern(regexp = "^[A-Za-z ]+$")
    @Column(name = "name")
    private String name;
    @Min(1000)
    @NotNull(message = "ko dc de trong")
    @Column(name = "price")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "loai_sach")
    private LoaiSach loaiSach;

    public Book(Long id, String name, Integer price, LoaiSach loaiSach) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.loaiSach = loaiSach;
    }

    public Book() {
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

    public LoaiSach getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(LoaiSach loaiSach) {
        this.loaiSach = loaiSach;
    }
}