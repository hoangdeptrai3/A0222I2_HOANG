package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String SELECT_ALL = "select * from product;";
    private final String DELETE_BY_ID = " delete from product where id =?;";
    private final String ADD_NEW = "insert into product(`name`,price,quantity,color,id_category) values (?,?,?,?,?);";
    private final String UPDATE_BY_ID = "update product set `name` = ?,price = ?,quantity = ?,color = ?,id_category = ? where id = ?";
    private final String SEARCH_BY = "call search(?)";

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int id_category = resultSet.getInt("id_category");
                Product product = new Product(id,name,price,quantity,color,id_category);
                productList.add(product);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public void create(Product product) {

        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW);
//            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5,product.getIdCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean edit(Product product) throws SQLException {
        boolean rowUpdate;
        Connection connection = BaseRepository.getConnectDB();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
        preparedStatement.setInt(6, product.getId());
        preparedStatement.setString(1, product.getName());
        preparedStatement.setInt(2, product.getPrice());
        preparedStatement.setInt(3, product.getQuantity());
        preparedStatement.setString(4, product.getColor());
        preparedStatement.setInt(5, product.getIdCategory());
        rowUpdate = preparedStatement.executeUpdate() > 0;
        return rowUpdate;
    }

    public List<Product> search(String name){
        List<Product> list = new ArrayList<>();
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
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int idCategory = resultSet.getInt("id_category");
                list.add(new Product(id,nameSearch,price,quantity,color,idCategory));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
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
