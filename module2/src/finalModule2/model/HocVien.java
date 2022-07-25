package finalModule2.model;

public class HocVien extends NhanSu{
    private float diemThi;
    private String tenLop;
    private String ngayNhapHoc;
    public HocVien(){
        super();
    }
    public HocVien(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, String soDienThoai, float diemThi, String tenLop, String ngayNhapHoc) {
        super(maDinhDanh, hoVaTen, ngaySinh, diaChi, soDienThoai);
        this.diemThi = diemThi;
        this.tenLop = tenLop;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "diemThi=" + diemThi +
                ", tenLop='" + tenLop + '\'' +
                ", ngayNhapHoc='" + ngayNhapHoc + '\'' +
                '}'+super.toString();
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,1",super.toData(),diemThi,tenLop,ngayNhapHoc);
    }
}
