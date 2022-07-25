package OnTap_Module_2.QuanLybenhVien.model;

import java.util.Date;

public class BenhNhanThuong extends BenhNhan{
    private double phiNamvien;

    public BenhNhanThuong(double phiNamvien) {
        this.phiNamvien = phiNamvien;
    }

    public BenhNhanThuong(int soThuTuBenhAn, String maBenhAn, String nameBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, double phiNamvien) {
        super(soThuTuBenhAn, maBenhAn, nameBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamvien = phiNamvien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                "phiNamvien=" + phiNamvien +
                '}'+super.toString();
    }
}
