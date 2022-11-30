package com.example.phone.dto;

import com.example.phone.model.LoaiSach;

import javax.persistence.*;
import javax.validation.constraints.*;

public class BookDTO {

    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;
    private Long loaiSach;

    public BookDTO() {
    }

    public BookDTO(Long id, String name, Integer price, Long loaiSach) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.loaiSach = loaiSach;
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

    public Long getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(Long loaiSach) {
        this.loaiSach = loaiSach;
    }
}
