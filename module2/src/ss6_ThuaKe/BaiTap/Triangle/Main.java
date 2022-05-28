package ss6_ThuaKe.BaiTap.Triangle;

import ss4_object_class.ThucHanh.Retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a :" );
        Double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap canh b :");
        Double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap canh c :");
        Double c = Double.parseDouble(sc.nextLine());
        System.out.println("nhap color :");
        String color = sc.nextLine();
        Triangle ip = new Triangle(a,b,c);
        System.out.println("area : " +ip.getArea());
        System.out.println("chu vi :" +ip.getPerimeter());
        System.out.println("information : " +"color :"+color  +ip.toString());
    }
}
