package repository.impl;

import model.Category;
import repository.ICategoryReprository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryReprository {
    private final String SELECT_ALL="SELECT * FROM category;";
    @Override
    public List<Category> findAll() {
            // kết nối db
            List<Category> categoryList = new ArrayList<>();
            Connection connection = BaseRepository.getConnectDB();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name_category");
                    Category category = new Category(id,name);
                    categoryList.add(category);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return categoryList;
        }
    }

