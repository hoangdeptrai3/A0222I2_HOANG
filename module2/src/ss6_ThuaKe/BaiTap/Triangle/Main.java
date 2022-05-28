package ss6_ThuaKe.BaiTap.Triangle;

import ss4_object_class.ThucHanh.Retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a :" );
        Double a = sc.nextDouble();
        System.out.println("Nhap canh b :");
        Double b = sc.nextDouble();
        System.out.println("Nhap canh c :");
        Double c = sc.nextDouble();
        Triangle ip = new Triangle(a,b,c);
        System.out.println("area : " +ip.getArea());
        System.out.println("chu vi :" +ip.getPerimeter());
        System.out.println("information : " +ip.toString());
    }
}
