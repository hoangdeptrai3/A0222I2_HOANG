package ss1_IntroductionToJava.BaiTap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnD;
        double enG;
        Scanner h = new Scanner(System.in);
        System.out.println("enter USA money");
        enG = h.nextDouble();
        vnD = enG * 23000;
        System.out.println("Vietnamese Dong :"+vnD);
    }
}
