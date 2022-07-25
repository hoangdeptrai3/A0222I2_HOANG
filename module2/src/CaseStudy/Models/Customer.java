package CaseStudy.Models;

import java.util.Date;

public class Customer extends Persion {
    private String maKH;
    private String loaiKhach;
    private String addres;

    public Customer(String maKH, String loaiKhach, String addres) {
        this.maKH = maKH;
        this.loaiKhach = loaiKhach;
        this.addres = addres;
    }

    public Customer(Date ngaySinh, boolean sex, int soCMND, int phoneNumber, String email, String maKH, String loaiKhach, String addres) {
        super(ngaySinh, sex, soCMND, phoneNumber, email);
        this.maKH = maKH;
        this.loaiKhach = loaiKhach;
        this.addres = addres;
    }
}
