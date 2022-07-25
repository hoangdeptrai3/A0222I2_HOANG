package project.libraryManager.view;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import project.libraryManager.model.Book;
import project.libraryManager.model.TextBook;
import project.libraryManager.service.LibraryManager;
import project.libraryManager.validate.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
   private static LibraryManager libraryManager = new LibraryManager();
   private static List<Book> list = new ArrayList<>();
    public static void main(String[] args) {
        int choice =-1;
            do{
                showMenu();
                choice = input();
                switch (choice){
                    case 1:
                        addBook();
                        break;
                    case 2:
                        edit();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        search();
                        break;
                    case 6:
                        sort();
                        break;
                }
            }while (choice != 6);
    }
    private static void showMenu(){
        System.out.println("-------menu----- \n"+
                           "1.add \n" +
                           "2.edit\n" +
                           "3.delete \n" +
                           "4.display\n" +
                           "5.Search\n" +
                           "6.Sort\n"+
                           "7.Exit\n");
    }
    private static int input(){
        System.out.print("please enter a number :");
        return Integer.parseInt(sc.nextLine());
    }
    private static String inputIsempty(String felb){
        String tmp = "0";
        do{
           System.out.print(tmp.isEmpty() ? "enter again" : "enter "+felb+":");
           tmp = sc.nextLine();
       }while (tmp.trim().isEmpty());
        return tmp;
    }

//    function
    private static void addBook(){
        System.out.println("1.story \n2.textBook");
        int choose = input();
       String name = "";
       do{
           System.out.print("name is :");
           name = sc.nextLine();
       }while (!Valid.checkName(name));
        String price = " ";
        do{
            System.out.println("price is :");
            price = sc.nextLine();
        }while (!Valid.checkPrice(price));
        String nhaSanXuat = inputIsempty("manutufacture ");
        int choose2 = input();
        if (choose == 1){
            System.out.println("enter the derpem..");
            String department = sc.nextLine();
            System.out.println("enter a className ");
            int className = Integer.parseInt(sc.nextLine());
            Book textBook = new TextBook(0,name,Double.parseDouble(price),nhaSanXuat,department,className);
            libraryManager.addBook(textBook);
        }


    }
    private static void edit(){

    }
    private static void delete(){
        display();
        boolean tmp = false;
        do{
            System.out.println(tmp ? "enter id again " : "enter id you wanna delete:");
            int id = Integer.parseInt(sc.nextLine());
            try{
                libraryManager.delete(id);
                System.out.println("delete thanh cong");
                tmp = false;
            }catch (NotFoundException e){
                e.getMessage();
                tmp = true;
            }
        }while (tmp);
    }
    private static void display(){
        List<Book> a = libraryManager.display();
        for (int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }

    }
    private static void search(){

            System.out.println("enter the name you want to search :");
            String name = sc.nextLine();
            List<Book> searchList = libraryManager.search(name);
            if (searchList.size()>0) {
                for (int i = 0; i < searchList.size(); i++) {
                    if (searchList.get(i).getName().equalsIgnoreCase(name)) {
                        System.out.println("have :" + searchList.get(i));
                        break;
                    }
                }
            }else {
                System.out.println("list isEmpty");
            }
        }

    private static void sort(){

    }


}
