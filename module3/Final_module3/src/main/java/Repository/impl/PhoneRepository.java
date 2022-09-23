package Repository.impl;

import Model.Phone;
import Repository.IPhoneRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    private final String SELECT_ALL = "select * from phone;";
    private final String DELETE_BY_ID = " delete from phone where id =?;";
    private final String ADD_NEW = "insert into phone(`name`,price,id_color) values (?,?,?);";
    private final String UPDATE_BY_ID = "update phone set `name` = ?,price = ?,id_color = ? where id = ?";
    private final String SEARCH_BY = "call search(?)";

    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int id_color = resultSet.getInt("id_color");
                Phone phone = new Phone(id,name,price,id_color);
                phoneList.add(phone);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return phoneList;
    }

    @Override
    public void create(Phone phone) {

        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
//            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(1, phone.getName());
            preparedStatement.setInt(2, phone.getPrice());
            preparedStatement.setInt(3, phone.getIdColor());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<Phone> search(String name){
        List<Phone> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(SEARCH_BY);
            callableStatement.setString(1,name);
            callableStatement.executeUpdate();
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameSearch = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int idColor = resultSet.getInt("id_color");
                list.add(new Phone(id,nameSearch,price,idColor));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }


    @Override
    public boolean edit(Phone phone) throws SQLException {
//        boolean rowUpdate;
//        Connection connection = BaseRepository.getConnectDB();
//        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
//        preparedStatement.setInt(6, product.getId());
//        preparedStatement.setString(1, product.getName());
//        preparedStatement.setInt(2, product.getPrice());
//        preparedStatement.setInt(3, product.getQuantity());
//        preparedStatement.setString(4, product.getColor());
//        preparedStatement.setInt(5, product.getIdCategory());
//        rowUpdate = preparedStatement.executeUpdate() > 0;
//        return rowUpdate;
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            int num = preparedStatement.executeUpdate();
            return (num == 1);
//            if (num==1){
//                return true;
//            }else{
//                return false;
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

}
