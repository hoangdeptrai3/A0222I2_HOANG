package demo;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class demo2{

    public static void main(String[] args) {
      int[] array;
        int size;
      Scanner sc = new Scanner(System.in);
      do{
          System.out.print("enter a number: ");
          size = sc.nextInt();
          if (size > 20){
              System.out.print("please enter a number not than 20");
          }
          array = new int[size];
      }while (size > 20);
//      input
       for (int i = 0 ; i< array.length;i++){
           System.out.print("nhap " +i);
           array[i] = sc.nextInt();
       }
//      output
        System.out.println(" mang da nhap :");
        for (int i = 0 ; i< array.length;i++){
            System.out.print(" "+ array[i]);
        }
//        mang dao
        for (int i = 0 ; i< array.length/2;i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 -i] = temp;
        }
        System.out.print(" mang da dao :");
        for (int i = 0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}