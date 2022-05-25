package ss3_array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static int searchNumber(int[] arr){
        Scanner sc = new Scanner(System.in);
        int search;
        search = sc.nextInt();
        for (int i= 0;i<arr.length;i++){
            if (search == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array;
        System.out.println("nhap so luong phan tu :");
        int size = sc.nextInt();
        array = new int[size];
//        input
        for (int i= 0 ;i < array.length;i++){
            System.out.println("nhap number thu " + i);
            array[i] = sc.nextInt();
        }

//     mang da nhap
        System.out.println(Arrays.toString(array));

        System.out.print("them so   : ");
        int val = sc.nextInt();
        System.out.println("vao vi tri :");
        int index = searchNumber(array);
        System.out.println("vi tri" +index);
        int[] res= add(array, val, index);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
//    private static int[] addNumber(int index, int[] arr){
//        int[] temp = new int[arr.length + 1];
//        for (int i = 0,j=0 ; i < arr.length;i++){
//            if (i != index){
//                temp[j++] += arr[i];
//            }
//        }
//        return temp;
private static int[] add(int[] arr, int val, int index){
    int length= arr.length;

    int[] tmp= new int[length+1];
    for (int i = 0; i < length; i++) {
        tmp[i]= arr[i];
    }

    for (int i = length; i > index ; i--) {
        if(i!=index){
            tmp[i]= arr[i-1];
        }
    }
    tmp[index]= val;
    return tmp;
}
}
