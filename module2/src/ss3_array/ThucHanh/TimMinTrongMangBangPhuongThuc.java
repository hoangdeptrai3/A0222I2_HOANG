package ss3_array.ThucHanh;

import java.util.Scanner;

public class TimMinTrongMangBangPhuongThuc {
    public static  void min(int[] array){

        int min = array[0];
        for (int i = 0;i< array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.print(" " +"min la " +min);
    }


    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        int input = sc.nextInt();
        array = new int[input];
//        nhap
        for (int i = 0;i<array.length;i++){
            System.out.println("nhap " +i);
            array[i] = sc.nextInt();
        }

//mang da nhap
        System.out.print("mang da nhap ");
        for (int i = 0 ;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        min(array);

    }

}
