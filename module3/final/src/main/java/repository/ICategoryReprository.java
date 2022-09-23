package repository;

import model.Category;

import java.util.List;

public interface ICategoryReprository {
    List<Category> findAll();
}
