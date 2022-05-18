package ss1_IntroductionToJava.BaiTap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name = h.nextLine();
        System.out.println("hello "+name);
    }
}
