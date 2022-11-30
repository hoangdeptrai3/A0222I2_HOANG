package com.example.mobile.DTO;

import com.example.mobile.model.KindPhone;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class PhoneDTO {

    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    private Long kindPhone;

    public PhoneDTO() {
    }

    public PhoneDTO(Long id, String name, Long price, Long kindPhone) {
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

    public Long getKindPhone() {
        return kindPhone;
    }

    public void setKindPhone(Long kindPhone) {
        this.kindPhone = kindPhone;
    }
}
