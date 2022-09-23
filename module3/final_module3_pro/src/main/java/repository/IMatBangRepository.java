package repository;

import model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> findAll();
//    void create(MatBang product);
//    boolean delete(int id);
//    List<MatBang> search(String loaiMatBang,int giaTien,int tang);
}
