package service.impl;

import model.LoaiMatBang;
import repository.impl.LoaiMatBangRepository;
import service.ILoaiMatBangService;

import java.util.List;

public class LoaiMatBangService implements ILoaiMatBangService {
    LoaiMatBangRepository loaiMatBangRepository = new LoaiMatBangRepository();
    @Override
    public List<LoaiMatBang> findAll() {
        return loaiMatBangRepository.findAll();
    }
}
