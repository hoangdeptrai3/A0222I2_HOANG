package CaseStudy.Controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        int choose = -1;
        do{
            System.out.println("menu \n"+
                                "1.Employee Management \n"+
                                "2.Customer Management \n"+
                                "3.Facility Management  \n"+
                                "4.Booking Management \n"+
                                "5.Promotion Management \n"+
                                "6.Exit \n"+
                    "-------------------------------------------------\n");
            System.out.println("enter a number:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("1.Display list employees\n" +
                                       "2.Add new employee \n" +
                                       "3.Edit employee \n" +
                                       "4.Return main menu \n"+
                            "--------------------------------------- ");
                    int subChoose = -1;
                    subChoose = Integer.parseInt(sc.nextLine());
//                    switch trong
                    switch (subChoose){
                        case 1:
                            System.out.println("h");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("ban nhap sai");
                    }
//                    close swith trong
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    int subChoose2 = -1;
                    subChoose2 = Integer.parseInt(sc.nextLine());
//                    switch trong
                    switch (subChoose2)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    int subChoose3 = -1;
                    subChoose3 = Integer.parseInt(sc.nextLine());
//                    swich trong
                    switch (subChoose3)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int subChoose4 = -1;
                    subChoose4 = Integer.parseInt(sc.nextLine());
//                    switch trong
                    switch (subChoose4)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int subChoose5 = -1;
                    subChoose5 = Integer.parseInt(sc.nextLine());
//                    switch trong
                    switch (subChoose5)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 6:
                    break;

            }
        }while(choose != 0);
    }
}
