package demo.QuanLySinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choose = 0;
        do{
            System.out.println("menu------------");
            System.out.println("" +
                    "1.Them sinh vien vao danh sach \n" +
                    "2.In danh thong tin sinh vien    \n"+
                    "3.Kiem tra danh sach co rong hay khong  \n" +
                    "4.Lay ra so luong sinh vien trong danh sach \n" +
                    "5.lam rong danh sach sinh vien \n" +
                    "6.Kiem tra sinh vien co ton tai trong danh sach hay khong dua tren ma sinh vien \n" +
                    "7.xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien \n" +
                    "8.Tim kiem tat ca sih vien dua vao ten \n"+
                    "9.Sap xep sinh vien giam dan theo diem tb \n"+
                    "0.Thoat chuong trinh \n" +
                    "   -------------------------- \n");
            System.out.print("please enter a number :");
            choose = Integer.parseInt(sc.nextLine());
            if (choose==1){
                System.out.print("nhap ma sinh vien :");
                String maSinhVien = sc.nextLine();
                System.out.print("nhap Ho va Ten : ");
                String hoVaTen = sc.nextLine();
                System.out.print("nhap Nam sinh :");
                int namSinh = Integer.parseInt(sc.nextLine());
                System.out.print("nhap diem tb");
                float diemTB = Float.parseFloat(sc.nextLine());
                SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTB);
                dssv.themSinhVien(sv);
            }else if (choose == 2){
                dssv.hienThiThongTinSV();
            }else if (choose == 3){
                System.out.println("danh sach rong : "+ dssv.KiemTraDsRong());
            }else if (choose == 4){
                System.out.println("so luong danh sach Sinh Vien :" +dssv.LaySoLuongSVTrongDanhSach());
            }else if (choose == 5){
                dssv.lamRongDanhSach();
            }else if (choose == 6){
                System.out.print("nhap ma sinh vien :");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("kiem tra ton tai sv :"+dssv.kiemTraTonTai(sv));
            }else if (choose == 7){
                System.out.print("nhap ma sinh vien :");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("xoa sv khoi danh sach " +dssv.xoaMotSinhVien(sv));
            }else if (choose == 8){
                System.out.print("moi nhap ten :");
                String hoVaTen = sc.nextLine();
                dssv.timKiemSv(hoVaTen);
            }else if (choose == 9){
                System.out.println("sap xep theo diem tb giam dan :");
                dssv.sapXepSVtheoDiemTB();
                dssv.hienThiThongTinSV();
            }


        }while(choose != 0);
    }
}
