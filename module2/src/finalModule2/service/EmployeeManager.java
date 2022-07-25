package finalModule2.service;

import finalModule2.exception.DuplicatePersonalRecordException;
import finalModule2.model.HocVien;
import finalModule2.model.NhanSu;
import finalModule2.model.Nhanvien;
import finalModule2.utill.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<NhanSu> nhanSus = new ArrayList<>();
    private static final String PATH = "src/finalModule2/data/personal_records.csv";
    FileHelper fileHelper = new FileHelper();
    public EmployeeManager(){
        nhanSus = mapToEmployee();
    }
    public void addEmployee(NhanSu nhanSu){
        nhanSus.add(nhanSu);
        fileHelper.writer(PATH,nhanSus,false);
    }
    public void delete(String maDinhDanh) throws DuplicatePersonalRecordException {
        for (int i = 0;i<nhanSus.size();i++){
            if (nhanSus.get(i).getMaDinhDanh().equals(maDinhDanh)){
                nhanSus.remove(i);
                fileHelper.writer(PATH,nhanSus,false);
                return;
            }
        }
        throw new DuplicatePersonalRecordException("not id :");
    }
    public List<NhanSu> findAll(){
        return nhanSus;
    }
    public List<NhanSu> mapToEmployee(){
        List<NhanSu> result = new ArrayList<>();

        List<String> lines = fileHelper.read(PATH);

        for (int i = 0; i < lines.size(); i++) {
            String[] tmp =  lines.get(i).split(",");
            String maDinhDanh = tmp[0];
            String hoVaTen = tmp[1];
            String ngaySinh = tmp[2];
            String diaChi = tmp[3];
            String soDienThoai = tmp[4];

            if(tmp[tmp.length - 1].equals("0")){
                double luong = Double.parseDouble(tmp[5]);
                String phongBan = tmp[6];
                String viTri = tmp[7];
                Nhanvien nv = new Nhanvien(maDinhDanh,hoVaTen,ngaySinh,diaChi,soDienThoai,luong,phongBan,viTri);
                result.add(nv);

            }
            else{
                float diemThi = Float.parseFloat(tmp[5]);
                String tenLop = tmp[6];
                String ngayNhapHoc = tmp[7];
                HocVien hv = new HocVien(maDinhDanh,hoVaTen,ngaySinh,diaChi,soDienThoai,diemThi,tenLop,ngayNhapHoc);
                result.add(hv);
            }
        }

        return result;

    }
}
