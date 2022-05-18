package demo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int array[];
        Scanner h = new Scanner(System.in);
        System.out.println("nhap so phan tu");
        int n = h.nextInt();
        array = new int[n];
        for (int i = 0; i<array.length;i++){
            array[i] = h.nextInt();
        }
        int i = 0;
        while (i < array.length){
            System.out.println(array[i++]);
        }

    }
}
