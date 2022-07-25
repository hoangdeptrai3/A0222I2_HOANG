package OnTap_Module_2.mobileManager;

public class ChinhHang extends DienThoai {
    public float thoiGianBaoHanh;
    public String maSoBaoHanh;

    public ChinhHang(){

    }

    public ChinhHang(int id, double price, String name, String nhaSanXuat, float thoiGianBaoHanh, String maSoBaoHanh) {
        super(id, price, name, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.maSoBaoHanh = maSoBaoHanh;
    }
    public void input(){
        super.input();
        System.out.println("thoi gian bao hanh :");
        this.thoiGianBaoHanh = Float.parseFloat(sc.nextLine());
        System.out.println("ma so bao hanh :");
        this.maSoBaoHanh = sc.nextLine();


    }

    @Override
    public String toString() {
        return "ChinhHang{" +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", maSoBaoHanh='" + maSoBaoHanh + '\'' +
                '}'+super.toString();
    }
}
