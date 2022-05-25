package demo;

import java.util.Scanner;

public class TongMang2Chieu {
    public static void main(String[] args) {
        int [][] array = {{2,2,3},{1,2,3},{1,2,3,}};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length;j++){
                total += array[i][j];
             }
        }
        System.out.println("kq :"+total);
    }
}
