package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findAll();
    void create(User user);
    boolean edit(User user) throws SQLException;
    boolean delete(int id);
    public List<User> selectUser(String name, String email, String country);
}
