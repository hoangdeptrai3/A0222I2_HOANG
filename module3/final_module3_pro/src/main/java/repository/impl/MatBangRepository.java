package repository.impl;

import model.MatBang;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepository implements IMatBangRepository {
    private final String SELECT_ALL = "select * from matbang;";
    private final String DELETE_BY_ID = " delete from matbang where id =?;";
    private final String ADD_NEW = "insert into matbang(`maMatBang`,trang_thai,dien_tich,tang,mo_ta_chi_tiet,gia_cho_thue,ngay_bat_dau,id_loai_mat_bang) values (?,?,?,?,?,?,?,?);";
    private final String SEARCH_BY = "call search(?)";
    @Override
    public List<MatBang> findAll() {
        List<MatBang> matbangList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("maMatBang");
                String trangThai  = resultSet.getString("trang_thai");
                double dienTich = resultSet.getDouble("dien_tich");
                int tang = resultSet.getInt("tang");
                int idLoaiMB = resultSet.getInt("id_loai_mat_bang");
                String moTaChiTiet = resultSet.getString("mo_ta_chi_tiet");
                int giaChothue = resultSet.getInt("gia_cho_thue");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                MatBang product = new MatBang(name,trangThai,dienTich,tang,idLoaiMB,moTaChiTiet,giaChothue,ngayBatDau);
                matbangList.add(product);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return matbangList;
    }

//    @Override
//    public void create(MatBang mb) {
//
//        Connection connection = BaseRepository.getConnectDB();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
//            preparedStatement.setString(1, mb.getMaMatBang());
//            preparedStatement.setString(2, mb.getTrangThai());
//            preparedStatement.setDouble(3,mb.getDienTich());
//            preparedStatement.setInt(4, mb.getTang());
//            preparedStatement.setString(5, mb.getMoTaChiTiet());
//            preparedStatement.setInt(6,mb.getGiaChoThue());
//            preparedStatement.setString(7, mb.getNgayBatDau());
//            preparedStatement.setInt(8,mb.getIdLoaiMB());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
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
