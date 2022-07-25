package OnTap_Module_2.QuanLybenhVien.model;

import java.util.Date;

public abstract class BenhNhan {
    protected int soThuTuBenhAn;
    protected String maBenhAn;
    protected String nameBenhNhan;
    protected Date ngayNhapVien;
    protected Date ngayRaVien;
    protected String lyDoNhapVien;
    public BenhNhan(){

    }

    public BenhNhan(int soThuTuBenhAn, String maBenhAn, String nameBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        this.soThuTuBenhAn = soThuTuBenhAn;
        this.maBenhAn = maBenhAn;
        this.nameBenhNhan = nameBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoThuTuBenhAn() {
        return soThuTuBenhAn;
    }

    public void setSoThuTuBenhAn(int soThuTuBenhAn) {
        this.soThuTuBenhAn = soThuTuBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getNameBenhNhan() {
        return nameBenhNhan;
    }

    public void setNameBenhNhan(String nameBenhNhan) {
        this.nameBenhNhan = nameBenhNhan;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public Date getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(Date ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "soThuTuBenhAn=" + soThuTuBenhAn +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", nameBenhNhan='" + nameBenhNhan + '\'' +
                ", ngayNhapVien=" + ngayNhapVien +
                ", ngayRaVien=" + ngayRaVien +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
