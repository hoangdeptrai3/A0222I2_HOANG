package finalModule2.veiw;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import OnTap_Module_2.PhoneManager.models.Phone;
import finalModule2.exception.DuplicatePersonalRecordException;
import finalModule2.model.HocVien;
import finalModule2.model.NhanSu;
import finalModule2.model.Nhanvien;
import finalModule2.service.EmployeeManager;
import finalModule2.validate.Valid;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private static EmployeeManager employeeManager = new EmployeeManager();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("---CHUONG TRINH QUAN LY BENH AN---\n"+
                                "Chon chuc nang theo so (de tiep tuc):\n"+
                                "1.add new \n"+
                                "2.delete \n"+
                                "3.display \n"+
                                "4.Exit \n");
            int choice = choice();
            switch (choice){
                case 1:

                    addEmployee();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    break;
            }
        }
    }
    private static int choice(){
        System.out.println("enter you choice:");
        return Integer.parseInt(sc.nextLine());
    }
    private static void addEmployee() {
        int choose = -1;
do{
    System.out.println("chon loai nhan su can them \n" +
            "1.them moi nhan vien \n" +
            "2.them moi hoc vien \n" +
            "3.Quay lai");
    choose = choice();

    while (choose != 3){

        String maDinhDanh = "";
        maDinhDanh = inputWithEmpty("moi nhap ma dinh danh ");
        String name = "";
        do {
            name = inputWithEmpty("nhap ten ");
        } while (!Valid.checkName(name));
        String ngaySinh = inputWithEmpty("nhap ngay sinh");

        String diachi = inputWithEmpty("nhap dia chi ");

        String soDienThoai = inputWithEmpty("nhap so dien thoai");

        if (choose == 1) {
            String luong = "";
            do {
                luong = inputWithEmpty("moi nhap luong ");
            } while (!Valid.checkLuong(luong));
            String phongBan = inputWithEmpty("moi nhap phong ban ");
            String viTri = inputWithEmpty("moi nhap vi tri ");
            NhanSu nhanSu = new Nhanvien(maDinhDanh, name, ngaySinh, diachi, soDienThoai, Double.parseDouble(luong), phongBan, viTri);
            employeeManager.addEmployee(nhanSu);
            break;
        } else if (choose == 2) {
            float diemThi = Float.parseFloat(sc.nextLine());
            String tenLop = inputWithEmpty("nhap ten lop");
            String ngayNhapHoc = inputWithEmpty("ngay nhap hoc ");
            NhanSu nhanSu2 = new HocVien(maDinhDanh, name, ngaySinh, diachi, soDienThoai, diemThi, tenLop, ngayNhapHoc);
            employeeManager.addEmployee(nhanSu2);
        } else {
            break;
        }

        System.out.println("them thanh cong ");
    }
}while (choose != 3);
}

    private static void delete(){
        display();
        boolean tmp = false;
        do{
            System.out.print(tmp ? "Enter id to delete again:" : "Enter id to delete:");
            String maDinhDanh = sc.nextLine();
            try{
                employeeManager.delete(maDinhDanh);
                System.out.println("Deleted successfully");
                tmp = false;

            }catch (DuplicatePersonalRecordException e){
                System.out.println(e.getMessage());
                tmp = true;
            }
        }while (tmp);
    }
    private static void display(){
        List<NhanSu> nhanSus = employeeManager.findAll();
        for (int i = 0;i<nhanSus.size();i++){
            System.out.println(nhanSus.get(i));
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

}





