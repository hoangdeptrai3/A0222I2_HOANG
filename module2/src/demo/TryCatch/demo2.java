package demo.TryCatch;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b;
        int c = 0;
        do {
            try {
                b = sc.nextInt();
                c = a / b;
                break;
            } catch (Exception e) {
                System.out.println("mau phai khac 0 ");
            }
        }while (true);
        System.out.println("kq "+c);
    }
}
