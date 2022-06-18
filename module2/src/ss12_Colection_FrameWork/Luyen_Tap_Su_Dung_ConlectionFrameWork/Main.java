package ss12_Colection_FrameWork.Luyen_Tap_Su_Dung_ConlectionFrameWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager testProduct = new ProductManager();
        int choose = -1;
        do{
            System.out.println("menu \n"+
                    "1.Them san pham \n"+
                    "2.Sua thong tin san pham theo id \n"+
                    "3.Xoa san pham theo id \n"+
                    "4.Hien thi danh sach san pham \n"+
                    "5.Tim kiem san pham theo ten \n"+
                    "6.Sap xep san pham tang dan \n"+
                    "7.Sap xep san pham giam dan \n"+
                    "------------------------------------------------ \n");
            System.out.print("please enter a number :");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){

                case 1 :
                    System.out.print("enter a id product :");
                    String idProduct = sc.nextLine();
                    System.out.print("enter a name Product :");
                    String nameProduct = sc.nextLine();
                    System.out.print("enter a price Product :");
                    float priceProduct = Float.parseFloat(sc.nextLine());
                    Product sp = new Product(idProduct,nameProduct,priceProduct);
                    testProduct.addProduct(sp);
                    break;
                case 2 :
                    testProduct.editProduct();
                    break;
                case 3 :
                    System.out.print("please enter a id product you want to remove : ");
                    String idProducts = sc.nextLine();
                    Product idSP = new Product(idProducts);
                    System.out.println("delete a product by id : "+testProduct.removeProduct(idSP));
                    break;
                case 4 :
                    testProduct.displayProducts();
                    break;
                case 5 :
                    System.out.println("nhap ten can tim :");
                    String name = sc.nextLine();;
                    testProduct.searchProduct(name);
                    break;
                case 6 :
                    System.out.println("sap xep tang dan theo gia da duoc thuc hien ..");
                    testProduct.sapXepTangDan();
                    break;
                case 7 :
                    System.out.println("da sap xep giam dan theo gia ...");
                    testProduct.sapXepGiamDan();
                    break;
            }
        }while (choose != 0);
    }
}
