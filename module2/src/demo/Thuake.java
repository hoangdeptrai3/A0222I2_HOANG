package demo;

import java.util.Scanner;

public class Thuake {
    public String name;
    public int age = 1111;
    public Thuake(){

    }
    public Thuake(String name,int age){
        this.name = name;
        this.age = age;
    }
}
 class Con extends Thuake{
     public int number;
    public Con(){

    }
     public Con(String name, int age, int number){
        super(name,age);
        this.number = number;
    }
    public void display(){
        System.out.println("your information : "+this.name + " " +this.age + " " +this.number);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("moi nhap ten ");
         String name = sc.nextLine();
         System.out.println("nhap tuoi :");
         int age = sc.nextInt();
         System.out.println("nhap number ");
         int number = sc.nextInt();
         Con c = new Con(name,age,number);
         c.display();

     }
}

