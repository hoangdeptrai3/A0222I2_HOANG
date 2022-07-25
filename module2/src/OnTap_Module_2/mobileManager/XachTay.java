package OnTap_Module_2.mobileManager;

import java.util.Scanner;

public class XachTay extends DienThoai {
    private String quocGia;
    private String trangThai;
    Scanner sc = new Scanner(System.in);

    public XachTay(){

    }

    public XachTay(String quocGia, String trangThai, Scanner sc) {
        this.quocGia = quocGia;
        this.trangThai = trangThai;
        this.sc = sc;
    }

    public XachTay(int id, double price, String name, String nhaSanXuat, String quocGia, String trangThai, Scanner sc) {
        super(id, price, name, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
        this.sc = sc;
    }
    public void input(){
        super.input();
        System.out.println("thoi gian bao hanh :");
        this.quocGia = sc.nextLine();
        System.out.println("ma so bao hanh :");
        this.trangThai= sc.nextLine();


    }
    @Override
    public String toString() {
        return "XachTay{" +
                "quocGia='" + quocGia + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", " +
                '}'+super.toString();
    }
}
