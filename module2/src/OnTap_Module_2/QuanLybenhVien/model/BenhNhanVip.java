package OnTap_Module_2.QuanLybenhVien.model;

import java.util.Date;

public class BenhNhanVip extends BenhNhan{
    private String vip;
    private Date thoiHanVip;

    public BenhNhanVip(String vip, Date thoiHanVip) {
        this.vip = vip;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhNhanVip(int soThuTuBenhAn, String maBenhAn, String nameBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, String vip, Date thoiHanVip) {
        super(soThuTuBenhAn, maBenhAn, nameBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.vip = vip;
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" +
                "vip='" + vip + '\'' +
                ", thoiHanVip=" + thoiHanVip +
                '}'+super.toString();
    }
}
