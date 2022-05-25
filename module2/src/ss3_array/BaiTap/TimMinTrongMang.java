package ss3_array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMinTrongMang {
    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        } return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("nhap so phan tu ");
       int size = sc.nextInt();
       arr = new int[size];
//       input
       for (int i = 0; i< arr.length;i++){
           System.out.println("nhap number thu " +i);
           arr[i] = sc.nextInt();
       }
//       output
        System.out.print("mang da nhap :" + Arrays.toString(arr));
//        for (int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] +"\t");
//        }
        int min = min(arr);
        System.out.print("\n"+ "min la :" +min);
    }
}
