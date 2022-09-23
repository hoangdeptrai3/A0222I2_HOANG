package service.impl;

import model.MatBang;
import repository.impl.MatBangRepository;
import service.IMatBangService;

import java.util.List;

public class MatBangService implements IMatBangService {
    MatBangRepository matBangRepository = new MatBangRepository();

    @Override
    public List<MatBang> findAll() {
        return matBangRepository.findAll();
    }

//    @Override
//    public void create(MatBang mb) {
//        matBangRepository.create(mb);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return false;
//    }
//
//    @Override
//    public List<MatBang> search(String loaiMatBang, int giaTien, int tang) {
//        return null;
//    }
}
