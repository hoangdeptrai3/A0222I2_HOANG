package demo.QuanLyShopQuanAo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanAoManager aq = new QuanAoManager();
        int choose;
        do{
            System.out.println("menu \n"+
                    "1.add \n"+
                    "2.display \n"+
                    "3.remove \n"+
                    "--------- \n");
            System.out.print("please enter a number :");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1 :
                    System.out.println("nhap id quan ao :");
                    int idQuanAo = Integer.parseInt(sc.nextLine());
                    System.out.println("nhap name quan ao :");
                    String nameQuanAo = sc.nextLine();
                    System.out.println("nhap gia :");
                    float priceQuanAo = Float.parseFloat(sc.nextLine());
                    QuanAo a = new QuanAo(idQuanAo,nameQuanAo,priceQuanAo);
                    aq.add(a);
                    break;
                case 2 :
                    aq.display();
                    break;
                case 3 :
                    System.out.println("nhap id quan ao ban muoon xoa :");
                    int id = Integer.parseInt(sc.nextLine());
                    aq.delete(id);
            }
        }while (choose != 0);
    }
}
