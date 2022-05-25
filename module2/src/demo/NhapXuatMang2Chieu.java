package demo;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class NhapXuatMang2Chieu {

        public static void main(String[] args) {
            int[][] matrix = new int[3][4];
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap "+ matrix.length + " dong va " + matrix[0].length + " cot cua matrix:");
            for(int row = 0; row < matrix.length ; row++) {
                for(int column = 0; column < matrix[row].length; column++) {
                    matrix[row][column] = input.nextInt();
                }
            }
            System.out.println("Xuat matrix co "+ matrix.length + " dong va " + matrix[0].length + " cot:");
            for(int row = 0; row < matrix.length ; row++) {
                for(int column = 0; column < matrix[row].length ; column++) {
                    System.out.print(matrix[row][column] + " ");
                }
                System.out.println();
            }

        }
}

