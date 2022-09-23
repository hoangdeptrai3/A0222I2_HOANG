package Service.impl;

import Service.IUserService;
import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    IUserRepository userRepository = new UserRepository();
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.create(user);
    }

    @Override
    public boolean edit(User user) throws SQLException {
        return userRepository.edit(user);
    }

    @Override
    public boolean delete(int id) {
       return userRepository.delete(id);
    }
    public List<User> selectUser(String name, String email, String country){
        return userRepository.selectUser(name,email,country);
    }
}
