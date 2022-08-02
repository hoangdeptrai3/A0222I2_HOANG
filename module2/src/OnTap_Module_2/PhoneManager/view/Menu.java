package OnTap_Module_2.PhoneManager.view;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import OnTap_Module_2.PhoneManager.Validate.Valid;
import OnTap_Module_2.PhoneManager.models.AuthenticPhone;
import OnTap_Module_2.PhoneManager.models.HandPhone;
import OnTap_Module_2.PhoneManager.models.Phone;
import OnTap_Module_2.PhoneManager.services.PhoneService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static PhoneService phoneService = new PhoneService();
    public static void main(String[] args) {
        while (true){
            System.out.println("------menu----- \n"+
                                "1.Add phone \n"+
                                "2.Display \n" +
                                "3.Delete \n" +
                                "4.Search \n" +
                                "5.Exit \n");
           int choose = getChoice();
            switch (choose){
                case 1:
                  addPhone();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void addPhone(){
        System.out.println("1. Authentic\n2. Hand");
        int choose = getChoice();
        String name = "";
        do{
            System.out.println("Input name");
            name = sc.nextLine();
        }while(!Valid.checkName(name));
        String price = "";
        do{
            System.out.println("price :");
            price = sc.nextLine();
        }while (!Valid.moreThan0(price));

        String manufacturer = inputWithEmpty("Manufacturer");
        Phone phone;
        if (choose == 1){
            int granteeByYear = Integer.parseInt(inputWithEmpty("Grantee by year "));
            String code = inputWithEmpty("grantee by code ");
            phone = new AuthenticPhone(0,name,Double.parseDouble(price),manufacturer,granteeByYear,code);
        }else {
            String country = inputWithEmpty("conutry ");
            String status = inputWithEmpty("status ");
            phone = new HandPhone(0,name,Double.parseDouble(price),manufacturer,country,status);
        }
        phoneService.addPhone(phone);
        System.out.println("Created successfully");
    }

    public static void display(){

        List<Phone> phones = phoneService.findAll();
        for (int i = 0;i<phones.size();i++){
            System.out.println(phones.get(i));
        }
    }
    public static void delete(){
        display();
        boolean tmp = false;
        do{
            System.out.print(tmp ? "Enter id to delete again:" : "Enter id to delete:");
            int id =Integer.parseInt(sc.nextLine());
            try{
                phoneService.delete(id);
                System.out.println("Deleted successfully");
                tmp = false;

            }catch (NotFoundException e){
                System.out.println(e.getMessage());
                tmp = true;
            }
        }while (tmp);
    }

    public static void search(){
        System.out.println("Enter the name you wanna search :");
        String name = sc.nextLine();
        List<Phone> phones = phoneService.search(name);
        if (phones.size() > 0){
            for (int i = 0; i< phones.size();i++){
                if (phones.get(i).getName().contains(name)){
                    System.out.println(phones.get(i));
                }
            }
        }else {
            System.out.println("empty list");
        }
    }

    private static String inputWithEmpty(String field){
        String val = "0";
        do{
            System.out.print(val.isEmpty() ? "Invalid format. Input again:": field+ ":");
            val = sc.nextLine();
        }while (val.trim().isEmpty());

        return val;
    }
    private static int getChoice(){
        System.out.print("Enter your choice:");
        return  Integer.parseInt(sc.nextLine());
    }
}
