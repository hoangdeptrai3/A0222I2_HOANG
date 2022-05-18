package ss2_Loop.ThucHanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        int Number = -1;
        Scanner h = new Scanner(System.in);
        while (Number != 0 ){
            System.out.println("MENU");
            System.out.println("1.retangle");
            System.out.println("2.Square");
            System.out.println("3.Triangle");
            System.out.print("please enter a number:");
            Number = h.nextInt();
            switch (Number){

                case 1:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 2:
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");

                    break;
                case 3:
                    System.out.println("*");
                    System.out.println("***");
                    System.out.println("*****");
                    System.out.println("*******");
                    break;
                case 0:
                    System.out.println("false");
                default:
                    System.out.println("vui long chon cac so tren menu");
            }
        }
    }
}
