package ss12_Colection_FrameWork.Luyen_Tap_Su_Dung_ConlectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> listProduct;
    Scanner sc =new Scanner(System.in);

    public ProductManager(){
        listProduct = new ArrayList<Product>();
    }
    public ProductManager(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }
//    1.Them san pham
    public void addProduct(Product sp){
        this.listProduct.add(sp);
    }
//    2.Sua thong tin san pham theo id
    public void editProduct(){
        System.out.print("nhap id product muon edit :");
        String idProduct = sc.nextLine();
        for (int i = 0 ;i<listProduct.size();i++){
            if (listProduct.get(i).getIdProduct().equals(idProduct) ){
                System.out.print("new name product :");
                String name = sc.nextLine();
                listProduct.get(i).setNameProduct(name);
                System.out.print("new price product :");
                float price = Float.parseFloat(sc.nextLine());
                 listProduct.get(i).setPrice(price);
            }else {
                System.out.println("ko co product nao trung khop vs id nay");
            }
        }
    }

//    3.xoa san pham theo id
    public boolean removeProduct(Product sp){
        return this.listProduct.remove(sp);
    }

//    4.hien thi danh sach san pham
    public void displayProducts(){
        for (Product sp : listProduct) {
            System.out.println("list product :"+sp);
        }
    }
//    5.Tim kiem san pham theo ten
    public void searchProduct(String ten){
       for (Product sp2 : listProduct){
           if (sp2.getNameProduct().contains(ten)){
               System.out.println("co " +sp2);

           }else {
               System.out.println("ko co ten nay trong danh sach");
           }
       }
    }
//    6.Sap xep san pham tang dan
    public void sapXepTangDan() {
        Collections.sort(this.listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product sv1, Product sv2) {
                if (sv1.getPrice() > sv2.getPrice()) {
                    return 1;
                } else if (sv1.getPrice() < sv2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
//    7.Sap xep san pham giam dan
public void sapXepGiamDan() {
    Collections.sort(this.listProduct, new Comparator<Product>() {
        @Override
        public int compare(Product sv1, Product sv2) {
            if (sv1.getPrice() > sv2.getPrice()) {
                return -1;
            } else if (sv1.getPrice() < sv2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    });
}
}