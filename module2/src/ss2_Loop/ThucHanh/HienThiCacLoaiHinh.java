package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle ");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.print("vui long chon 1 number : ");
        int Number = h.nextInt();
        while (true) {
            if (Number == 1) {
                int length;
                int width;
                System.out.println("enter a legth");
                length = h.nextInt();
                System.out.println("enter a width");
                width = h.nextInt();
                if (width == length) {
                    System.out.println("vui long nhap lai");
                } else {
                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= length; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                }

            }
         if (Number == 2){
            int height;
             System.out.print("please enter height :");
             height = h.nextInt();
             if (height >0){
                 for (int i = 1; i <=height;i++){
                     for (int j = 1;j <= i; j++){
                         System.out.print(" * ");
                     }
                     System.out.println("\n");
                 }
                 break;
             }else {
                 System.out.println("height must than 0");
             }
         }
         if (Number == 3){
             int height;
             System.out.print("please enter height :");
             height = h.nextInt();
             int width = height*2 -1;
             if(height > 0){
                 for (int i = 1 ; i <= height;i++){
                     for (int j = 0; j <= width/2-i; j++){
                         System.out.print(" ");
                     }
                     for (int k = 0;k < i*2-1;k++){
                         System.out.print("*");
                     }
                     System.out.print("\n");
                 }
                 break;
             }else {
                 System.out.println("chieu cao phai lon hon 0");
             }


         }
         if (Number == 4){
             break;
         }

        }
    }
}

