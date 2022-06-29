package demo.TryCatch;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = " ";
        int age = 0;
        float weight = 0;
        do{
            try{
                System.out.print("your name :");
                name = sc.nextLine();
                System.out.print("your age ?");
                age = Integer.parseInt(sc.nextLine());
                System.out.print("your weight :");
                weight = Float.parseFloat(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("age,weight phai la number");
            }
            catch (Exception a ){
                System.out.println("ban nhap ko dung  ");
            }
        }

            while (true);
        System.out.println("your name is "+name+" ,age :"+age +" weight "+weight);

    }
}
