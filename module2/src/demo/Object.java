package demo;

import java.util.Scanner;

public class Object {
    Scanner sc =new Scanner(System.in);
        String name;
        int age;
        public Object(){
        }
        public Object(String name,int age){
            this.name = name;
            this.age = age;
        }
        public void display(){
            System.out.println("moi nhap name :");
            this.name = sc.nextLine();
            System.out.println("moi nhap tuoi :");
            this.age = sc.nextInt();
            if (this.age >30){
                System.out.println("ban qua gia ");
            }else {
                System.out.println("ban con tre ");
            }
        }



    public static void main(String[] args) {
            Object a = new Object();
            a.display();

    }
}
