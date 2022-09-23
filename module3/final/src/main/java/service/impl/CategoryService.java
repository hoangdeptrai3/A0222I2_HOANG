package service.impl;

import model.Category;
import repository.ICategoryReprository;
import repository.impl.CategoryRepository;
import service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    CategoryRepository categoryService = new CategoryRepository();
    @Override
    public List<Category> findAll() {
        return categoryService.findAll();
    }
}
