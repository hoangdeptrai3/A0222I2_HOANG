package ss3_array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class DemKyTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[];
        System.out.print("nhap so luong ky tu :");
        String input = sc.nextLine();
        arr = new String[Integer.parseInt(input)];

//        input
        for (int i = 0;i<arr.length;i++){
            System.out.print("moi nhap ky tu thu " +i +" : ");
            arr[i] = sc.nextLine();
        }

//        output
        System.out.println(Arrays.toString(arr));
        System.out.print("nhap ky tu can tim :");
        String search = sc.nextLine();
        String vitri = "  ";
        int count = 0;
        String chart = " ";
        for (int i = 0; i< arr.length;i++){
            if (arr[i].equals(search)){
                count++;
                chart = arr[i];
                vitri += i;
            }
        }
        System.out.println("Co: "+count +" "+ " ky tu: " + chart +","+ " vi tri: " +vitri);
    }
}
