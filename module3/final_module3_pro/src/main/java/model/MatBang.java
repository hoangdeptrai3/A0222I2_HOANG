package model;

public class MatBang {
    private String maMatBang;
    private String trangThai;
    private double dienTich;
    private int tang;
    private int idLoaiMB;
    private String moTaChiTiet;
    private int giaChoThue;
    private String ngayBatDau;
    public MatBang() {
    }

    public MatBang(String maMatBang, String trangThai, double dienTich, int tang, int idLoaiMB, String moTaChiTiet, int giaChoThue, String ngayBatDau) {
        this.maMatBang = maMatBang;
        this.trangThai = trangThai;
        this.dienTich = dienTich;
        this.tang = tang;
        this.idLoaiMB = idLoaiMB;
        this.moTaChiTiet = moTaChiTiet;
        this.giaChoThue = giaChoThue;
        this.ngayBatDau = ngayBatDau;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getIdLoaiMB() {
        return idLoaiMB;
    }

    public void setIdLoaiMB(int idLoaiMB) {
        this.idLoaiMB = idLoaiMB;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public int getGiaChoThue() {
        return giaChoThue;
    }

    public void setGiaChoThue(int giaChoThue) {
        this.giaChoThue = giaChoThue;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
}
