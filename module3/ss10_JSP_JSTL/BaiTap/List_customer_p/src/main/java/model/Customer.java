package model;

import java.util.Date;

public class Customer {
    private String name;
    private String birthday;
    private String diaChi;
    private String img;

    public Customer(String name, String birthday, String diaChi, String img) {
        this.name = name;
        this.birthday = birthday;
        this.diaChi = diaChi;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}