package ss2_Loop.BaiTap;

import java.util.Scanner;

public class KtraSntNhorHon20 {
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


        Scanner src = new Scanner(System.in);
        System.out.println("nhap so luong ");
        int number = src.nextInt();
        int n = 2;
        int count = 1;
        while (count <= number){
            if (KtraSNTT(n) == true){
                System.out.println("snt "+n);
                count++;

            }
            n++;

        }


    }
}
