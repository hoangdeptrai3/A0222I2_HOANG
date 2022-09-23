package repository.impl;

import model.User;
import repository.IUserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private final String SELECT_ALL = "select * from userH;";
    private final String DELETE_BY_ID = " delete from userH where id =?;";
    private final String ADD_NEW = "insert into userH(`name`,email,country) values (?,?,?);";
    private final String UPDATE_BY_ID = "update userH set name = ?,email = ?,country = ? where id = ?";
    private final String SEARCH_BY = "call search(?,?,?)";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
       try{
           PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
           ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString("name");
               String email = resultSet.getString("email");
               String country = resultSet.getString("country");
               User user = new User(id,name,email,country);
               userList.add(user);
           }
       }catch (SQLException throwables){
           throwables.printStackTrace();
       }
        return userList;
    }

    @Override
    public void create(User user) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
//            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean edit(User user) throws SQLException {
        boolean rowUpdate;
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setInt(4, user.getId());
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        rowUpdate = preparedStatement.executeUpdate() > 0;
        return rowUpdate;
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

    @Override
    public List<User> selectUser(String name, String email, String country) {
        List<User> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement = connection.prepareCall(SEARCH_BY);
            callableStatement.setString(1,name);
            callableStatement.setString(2,email);
            callableStatement.setString(3,country);
            callableStatement.executeUpdate();
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                int idSearch = resultSet.getInt("id");
                String nameSearch = resultSet.getString("name");
                String emailSearch = resultSet.getString("email");
                String countrySearch = resultSet.getString("country");
                list.add(new User(idSearch, nameSearch, emailSearch, countrySearch));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
}
