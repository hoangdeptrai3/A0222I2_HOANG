package CaseStudy.Models;

import java.util.Date;

public abstract class Persion {
    private Date ngaySinh;
    private boolean sex;
    private int soCMND;
    private int phoneNumber;
    private String email;
    public Persion(){

    }

    public Persion(Date ngaySinh, boolean sex, int soCMND, int phoneNumber, String email) {
        this.ngaySinh = ngaySinh;
        this.sex = sex;
        this.soCMND = soCMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
