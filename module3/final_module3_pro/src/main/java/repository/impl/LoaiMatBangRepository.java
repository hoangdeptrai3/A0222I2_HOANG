package repository.impl;

import model.LoaiMatBang;
import repository.ILoaiMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiMatBangRepository implements ILoaiMatBangRepository {
    private final String SELECT_ALL = "select * from loaimatbang;";
    @Override
    public List<LoaiMatBang> findAll() {
        List<LoaiMatBang> loaiMatBangList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_mb");
                LoaiMatBang loaiMatBang = new LoaiMatBang(id,name);
              loaiMatBangList.add(loaiMatBang);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return loaiMatBangList;
    }
    }

