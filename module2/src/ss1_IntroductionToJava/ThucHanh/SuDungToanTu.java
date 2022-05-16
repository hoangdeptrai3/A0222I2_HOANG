package ss1_IntroductionToJava.ThucHanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args){
        float width;
        float height;
        Scanner a = new Scanner(System.in);
        System.out.println("enter width :");
        width = a.nextFloat();
        System.out.println("enter height :");
        height = a.nextFloat();
        float area = width * height;
        System.out.println("dien tich hcn la : "+area);
    }
}
