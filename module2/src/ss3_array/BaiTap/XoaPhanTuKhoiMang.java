package ss3_array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static int searchNumber(int[] array){
        Scanner sc =new Scanner(System.in);
        System.out.print("\n"+ "nhap so phan tu can xoa :");
        int delete = sc.nextInt();
        for (int i = 0;i< array.length;i++){
            if (array[i] == delete){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        System.out.print("nhap phan so phan tu :");
        int input = sc.nextInt();
        array = new int[input];
//        nhap vao array
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhap phan tu thu " + i);
            array[i] = sc.nextInt();
        }
//            output
        System.out.print("mang da nhap :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        int index = searchNumber(array);
        System.out.println(index);

        System.out.println(Arrays.toString(remove(index, array)));
    }

    private static int[] remove(int index, int[] arr){
        int[]tmp  = new int[arr.length -1];

        for (int i =0, j = 0; i < arr.length; i++){
            if(i != index){
                tmp[j++] = arr[i];
            }
        }

        return tmp;
    }
}

