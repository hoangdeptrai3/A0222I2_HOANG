package ss3_array.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {

    public static void chuyenDoiCsangF() {
        double C;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap do C :");
        C = sc.nextDouble();
        Double F = (9 * C) / 5 + 32;
        System.out.println("ker qua F :" + F);
    }

    public static void chuyenDoiFsangC() {
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap do F :");
        F = sc.nextDouble();
        Double C = 5 * (F - 32) / 9;
        System.out.print(" ket qua C :" + C);
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

//        chuyenDoiCsangF();
//        chuyenDoiFsangC();
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    chuyenDoiFsangC();
                    break;
                case 2:
                    chuyenDoiCsangF();
                    break;
                case 0 :
                    System.exit(0);
            }

        } while (choice != 0);
    }
 }


