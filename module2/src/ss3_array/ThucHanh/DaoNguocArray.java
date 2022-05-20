package ss3_array.ThucHanh;

import java.util.Scanner;

public class DaoNguocArray {
    public static void main(String[] args){
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter a number :");
            size = sc.nextInt();
            if (size > 20){
                System.out.print("nhap lai :");
            }
        }while (size > 20);
        array = new int[size];

//        input
        for (int i = 0;i<array.length;i++){
            System.out.print("enter a number :" +(i+1) + " : ");
            array[i] = sc.nextInt();
        }

//        output
        System.out.print("mang da nhap : ");
        for (int i = 0 ; i< array.length;i++){
            System.out.print(array[i] +" ");
        }
//        daomang
        for (int i = 0; i< array.length/2;i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
//        output mang dao
        System.out.print("\n" +"mang da dao :");
        for (int i = 0 ;i<array.length;i++){
            System.out.print(" " +array[i]);
        }
    }
}
