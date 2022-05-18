package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class KtraSNT {
    public static boolean KtraSNTT(int n){
        if (n < 2){
            return false;
        }else {
            for (int i = 2;i<= Math.sqrt(n);i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        KtraSNT a = new KtraSNT();
//        Scanner h = new Scanner(System.in);
//        System.out.println("please enter a number");
//        int Number = h.nextInt();
//        boolean flag = true;
//        if (Number < 2) {
//            System.out.println("ko phai snt");
//            flag = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(Number); i++) {
//                if (Number % i == 0) {
//                    flag = false;
//                }
//            }
//        }
//        if (flag == true) {
//            System.out.println("la so nguyen to");
//        }else {
//            System.out.println("ko phai snt");
//        }

        Scanner b = new Scanner(System.in);
        System.out.println("nhap so luong nguyen to");
        int n  = b.nextInt();
        int count = 0;
        while (count <= n){
            if (a.KtraSNTT(n)==true){
                System.out.println("snt "+n);
                count++;
            }
            n++;

        }


    }
}
