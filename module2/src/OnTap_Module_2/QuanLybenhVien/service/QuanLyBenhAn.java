package OnTap_Module_2.QuanLybenhVien.service;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import OnTap_Module_2.QuanLybenhVien.model.BenhNhan;
import OnTap_Module_2.QuanLybenhVien.util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBenhAn {
    private List<BenhNhan> list = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    public QuanLyBenhAn(){
        list = new ArrayList<>();
    }
    public void add(BenhNhan bn){
        int lastID = 0;
        if (list.size()>0){
            lastID = list.get(list.size()-1).getSoThuTuBenhAn();
        }
        bn.setSoThuTuBenhAn(lastID+1);
        list.add(bn);
    }

    public void delete(String maBenhAn) throws NotFoundException {
        for (int i = 0;i<list.size();i++){
            if (list.get(i).getMaBenhAn().equals(maBenhAn)){
                list.remove(i);
                return;
            }
        }
        throw new NotFoundException(maBenhAn +" isEmpty");
    }
    public List<BenhNhan> findAll(){
        return list;
    }

}
