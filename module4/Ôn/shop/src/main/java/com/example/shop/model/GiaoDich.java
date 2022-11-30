package com.example.shop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Table(name = "giao_dich")
@Entity
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank(message = "phải dùng chuỗi")
    @NotEmpty(message = "ko dc để trống")
    @Column(name = "ma_giao_dich")
    private String maGD;
//    @Column(name = "ma_Khach_hang")
//    private String maKH;
@NotEmpty(message = "ko dc để trống")
    @Column(name = "ngay_giao_dich")
    private String ngayGD;
    @NotEmpty(message = "ko dc để trống")
    @Column(name = "loai_dich_vu")
    private String loaiDV;
    @NotNull
    @Column(name = "don_Gia")
    private Integer donGia;
    @NotNull
    @Column(name = "dien_tich")
    private Integer dienTich;
    @ManyToOne
    @JoinColumn(name = "name")
    private KhachHang khachHang;
    public GiaoDich() {
    }

    public GiaoDich(Long id, String maGD, String ngayGD, String loaiDV, Integer donGia, Integer dienTich, KhachHang khachHang) {
        this.id = id;
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.loaiDV = loaiDV;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.khachHang = khachHang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public Integer getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    public Integer getDienTich() {
        return dienTich;
    }

    public void setDienTich(Integer dienTich) {
        this.dienTich = dienTich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}