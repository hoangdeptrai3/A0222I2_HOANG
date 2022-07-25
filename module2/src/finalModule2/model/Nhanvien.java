package finalModule2.model;

public class Nhanvien extends NhanSu{
    private double luong;
    private String phongBan;
    private String viTri;
    public Nhanvien(){
        super();
    }
    public Nhanvien(String maDinhDanh, String hoVaTen, String ngaySinh, String diaChi, String soDienThoai, double luong, String phongBan, String viTri) {
        super(maDinhDanh, hoVaTen, ngaySinh, diaChi, soDienThoai);
        this.luong = luong;
        this.phongBan = phongBan;
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "luong=" + luong +
                ", phongBan='" + phongBan + '\'' +
                ", viTri='" + viTri + '\'' +
                '}'+super.toString();
    }
    public String toData(){
        return String.format("%s,%s,%s,%s,0",super.toData(),luong,phongBan,viTri);
    }
}
