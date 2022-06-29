package demo.QuanLySach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList textBook = new BookList();
        Scanner sc = new Scanner(System.in);
        int choose = -1;
        do {
            System.out.println("menu \n"+
                    "1.add book \n" +
                    "2.remove book theo id \n"+
                    "3.display list book \n"+
                    "4.sort tang dan theo gia \n"+
                    "5.sort giam dan theo gia \n"+
                    "--------------------------- \n");
            System.out.println("please enter a number : ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1:
                    System.out.print("enter a name book :");
                    String nameBook = sc.nextLine();
                    System.out.print("enter a id book :");
                    String idBook = sc.nextLine();
                    System.out.print("enter a price book :");
                    float priceBook=0;
                    do{
                        try{
                            priceBook = Float.parseFloat(sc.nextLine());
                            break;
                        }catch (Exception e){
                            System.out.print("gia phai la number ");
                        }
                    }while (true);
                    Book sach = new Book(nameBook,idBook,priceBook);
                    textBook.addBook(sach);
                    break;
                case 2:
                    System.out.print("enter a id you want to remove : ");
                    String idBooks = sc.nextLine();
                    Book sp = new Book(idBooks);
                    System.out.println("remove book :" +  textBook.removeBook(sp));
                    break;
                case 3:
                    System.out.println("list book :");
                    textBook.displayListBook();
                    break;
                case 4:
                    System.out.println("da thuc hien sap xep");
                    textBook.sapXepTang();
            }
        }while (choose != 0);
    }
}
