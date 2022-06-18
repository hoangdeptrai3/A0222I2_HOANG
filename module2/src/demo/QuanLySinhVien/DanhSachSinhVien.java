package demo.QuanLySinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
//   1.  them sinh vien
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
//    2. hien thi thong tin sinh vien
   public void hienThiThongTinSV(){
        for(SinhVien sinhVien : danhSach){
            System.out.println(sinhVien);
        }
   }
//    3. kiem tra danh sach co rong hay khong
    public boolean KiemTraDsRong(){
        return this.danhSach.isEmpty();
    }
//    4. Lay so luong sinh vien trong danh sach
    public int LaySoLuongSVTrongDanhSach(){
        return this.danhSach.size();
    }
//    5 . Lam rong danh sach sinh vien
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
//    6.Kiem tra sinh vien co ton tai trong danh sach hay khong dua tren ma sinh vien

    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }

//    7.xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien
    public boolean xoaMotSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
//    8.Tim kiem tat ca sih vien dua vao ten
    public void timKiemSv(String ten){
        for (SinhVien sinhvien : danhSach ) {
            if (sinhvien.getHoVaTen().indexOf(ten) >= 0){
                System.out.print("co " +sinhvien);
            }
        }
    }
//    9.Sap xep sinh vien giam dan theo diem tb
    public void sapXepSVtheoDiemTB(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
               if (sv1.getDiemTb() < sv2.getDiemTb()){
                   return 1;
               }else if (sv1.getDiemTb() > sv2.getDiemTb()){
                   return -1;
               }else {
                   return 0;
               }
            }
        });
    }
}
