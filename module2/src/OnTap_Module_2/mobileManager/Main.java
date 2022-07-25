package OnTap_Module_2.mobileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perform textPerForm = new Perform();

        int choose =-1;
        do{
            showMenu();
            System.out.print("enter a number :");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1 :
                    int choose2 = -1;
                    System.out.print("1.xach tay \n"+
                                       "2.Chinh Hang \n"+
                                     "---------------- \n");
                    choose2 = Integer.parseInt(sc.nextLine());
                    switch (choose2) {

                        case 1:
                           XachTay xachTay = new XachTay();
                           xachTay.input();
                           textPerForm.addMobile(xachTay);
                           break;
                        case 2:
                            ChinhHang chinhHang = new ChinhHang();
                            chinhHang.input();
                            textPerForm.addMobile(chinhHang);
                            break;

                    }
                    break;
//                    display
                case 2:
                              textPerForm.display();
                            break;
//                       delete
                case 3:
                    System.out.println("nhap id ban muon xoa ");
                    int id = Integer.parseInt(sc.nextLine());
                            textPerForm.delete(id);
                            break;
//                        search
                case 4:
                    System.out.println("moi nhan name ban muon tim ");
                    String name = sc.nextLine();
                    textPerForm.searchName(name);
                    break;
            }


//                    DienThoai dienThoai = new DienThoai(id,price,name,nhaSanXuat);
//                    textDienThoai.add(dienThoai);
            }while (choose != 0);

        }
    static void showMenu(){
        System.out.println("menu \n"+
                "------------------ \n"+
                "1.Add \n"+
                "2.display \n"+
                "3.delete  \n"+
                "4.Search name \n"+
                "0.Exit");
    }
}

