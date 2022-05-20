package ss3_array.ThucHanh;

import java.util.Scanner;

public class TimMaxInArray {
    public static void main(String[] args) {
        int[] number;
        int input;
        Scanner sc =new Scanner(System.in);
        System.out.println("moi nhap so phan tu :");
        input = sc.nextInt();
        number = new int[input];

        for (int i =0;i< number.length;i++){
            System.out.print("nhap number thu : " +i + " : ");
            number[i] = sc.nextInt();
        }
        System.out.println("number da nhap ");
        for (int i = 0;i< number.length;i++){
            System.out.print(" "+ number[i]);
        }
        int max = number[0];
        for (int i = 0 ; i< number.length;i++){
            if (number[i] > max){
                max = number[i];
            }
        }
        System.out.print("\n"+ "max la : " +max);

    }
}
