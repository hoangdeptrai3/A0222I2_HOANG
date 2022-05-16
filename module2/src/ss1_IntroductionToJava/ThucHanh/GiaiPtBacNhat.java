package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class GiaiPtBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        double x;
        Scanner h = new Scanner(System.in);
        System.out.println("moi nhap a");
        a = h.nextDouble();
        System.out.println("moi nhap b");
        b = h.nextDouble();
        if (a != 0){
            System.out.println("pt bac nhat co dang ax +b = 0 co nghiem x =" + (x=-b/a));
        }else {
            System.out.println("ko phai ptbn");
        }
    }
}
