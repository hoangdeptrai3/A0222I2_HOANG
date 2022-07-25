package OnTap_Module_2.QuanLybenhVien.view;

import OnTap_Module_2.QuanLybenhVien.service.QuanLyBenhAn;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
   private static Scanner sc = new Scanner(System.in);
   private static QuanLyBenhAn ql = new QuanLyBenhAn();
    public static void main(String[] args) {
        while (true){
            showMenu();
            int choice = choice();
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
    public static void add(){
//        String maBenhAn = "";
//        do{
//
//        }while ();
//        String nameBenhNhan = "";
//        do{
//
//        }while ();
//
//        String ngayNhapVien = "dd/MM/yyyy";


    }
    public static void delete(){

    }
    public static void display(){

    }

    public static  void showMenu(){
        System.out.println("--CHUONG TRINH QUAN LY BENH AN-- \n"+
                "1.add new \n"+
                "2.delete \n"+
                "3.Xem danh sach cac benh an \n"+
                "4.Exit \n");
    }
    private static int choice(){
        System.out.print("enter your choice :");
        return Integer.parseInt(sc.nextLine());
    }
}
