package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int month;
        Scanner h = new Scanner(System.in);
        System.out.println("moi nhap thang :");
        month = h.nextInt();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
                System.out.println("thang " +month+" co 31 ngay");
                break;
            case 2:
                System.out.println("thang " +month+" co 28 or 29 ngay");
                break;
            default:
                System.out.println("thang " +month + " co 30 ngay");
                break;
        }
    }
}
