package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class UngDugTinhTienLai {
    public static void main (String[] args){
        double SoTienGui =1.0;
         float Tile = 4;
        int Month = 1;
        double TienLai = 0;
        Scanner h = new Scanner(System.in);
        System.out.print(" moi nhap so tien gui : ");
        SoTienGui = h.nextDouble();
        System.out.println("nhap so thang");
        Month = h.nextInt();
       for (int i = 0 ; i<= Month ; i++){
           TienLai += SoTienGui * (Tile/100) /12* Month;
       }
        System.out.println("tien lai = " + TienLai);
    }
}
