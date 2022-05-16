package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args){
        int year;
        Scanner h = new Scanner(System.in);
        System.out.println("nhap year :");
        year = h.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("la nam nhuan");
                }else {
                    System.out.println("ko phai nam nhuan");
                }
            }else {
                System.out.println("la nam nhuan");
            }
        }else {
            System.out.println("ko phai nam nhuan");
        }
    }

}
