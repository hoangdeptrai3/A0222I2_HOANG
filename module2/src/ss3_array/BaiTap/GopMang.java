package ss3_array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr3 = new int[length1 + length2];
        System.out.println("mang 1 " +Arrays.toString(arr1));
        System.out.println("mang 2 " +Arrays.toString(arr2));
        System.out.println("mang sau khi gop 2 mang : ");
        for (int i = 0;i< length1;i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0;i<length2;i++){
            arr3[length1 + i] = arr2[i];
        }
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }
        System.out.println(Arrays.toString(arr3));
    }
}
