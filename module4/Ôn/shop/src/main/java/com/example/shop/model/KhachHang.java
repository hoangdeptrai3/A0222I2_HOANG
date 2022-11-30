package com.example.shop.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "khach_hang")
@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
//    @Column(name = "ma_khach_hang")
//    private String maKH;
    @Column(name = "name")
    private String name;
//    @Column(name = "so_dien_thoai")
//    private String soDT;
//    @Column(name = "email")
//    private String email;
    @OneToMany(mappedBy = "khachHang")
    List<GiaoDich> giaoDiches;
    public KhachHang() {
    }

    public KhachHang(Long id, String name, List<GiaoDich> giaoDiches) {
        this.id = id;
        this.name = name;
        this.giaoDiches = giaoDiches;
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

    public List<GiaoDich> getGiaoDiches() {
        return giaoDiches;
    }

    public void setGiaoDiches(List<GiaoDich> giaoDiches) {
        this.giaoDiches = giaoDiches;
    }
}