package Repository.impl;

import Model.Color;
import Repository.IColorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColorRepository implements IColorRepository {

        private final String SELECT_ALL="SELECT * FROM color;";
        @Override
        public List<Color> findAll() {
            // kết nối db
            List<Color> colorList = new ArrayList<>();
            Connection connection = BaseRepository.getConnectDB();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name_color");
                    Color color = new Color(id,name);
                    colorList.add(color);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return colorList;
        }
    }

