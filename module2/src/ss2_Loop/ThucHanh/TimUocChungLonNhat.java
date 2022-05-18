package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
       int a;
       int b;
        Scanner h = new Scanner(System.in);
        System.out.println("nhap a");
        a = h.nextInt();
        System.out.println("nhap b");
        b = h.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("ko co UCLN");
        }
        while (a != b){
            if (a >b){
                a = a-b;
            }else {
                b = b -a;
            }
        }
        System.out.println("UCLN " +a);
    }
}
