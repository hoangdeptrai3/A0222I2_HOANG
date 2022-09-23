package Repository;

import Model.Phone;

import java.sql.SQLException;
import java.util.List;

public interface IPhoneRepository {
    List<Phone> findAll();
    void create(Phone phone);
    boolean edit(Phone product) throws SQLException;
    boolean delete(int id);
    List<Phone> search(String name);
}
