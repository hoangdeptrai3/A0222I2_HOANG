package OnTap_Module_2.mobileManager;

import java.util.Scanner;

public abstract class DienThoai{
    public static int count = 0;
    protected int id;
    protected double price;
    protected String name;
    protected String nhaSanXuat;
    Scanner sc = new Scanner(System.in);
    public DienThoai(){

    }

    public DienThoai( int id,double price, String name, String nhaSanXuat) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.nhaSanXuat = nhaSanXuat;
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void input(){
//        System.out.println("enter a id ");
//        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("enter a name ");
        this.name = sc.nextLine();
        System.out.println("enter a price ");
        this.price = Float.parseFloat(sc.nextLine());
        System.out.println("nhap nha san xuat :");
        this.nhaSanXuat = sc.nextLine();
    }
    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }


}
