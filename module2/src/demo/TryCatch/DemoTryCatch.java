package demo.TryCatch;

import java.util.Scanner;

public class DemoTryCatch<n> {
    private static Object Exception;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("nhap so nguyen :");

        do {
            try{
                n = Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("ban vua nhap khong dung  "+e);
            }

        }while (true);
        System.out.println("kq "+n);

    }
}

