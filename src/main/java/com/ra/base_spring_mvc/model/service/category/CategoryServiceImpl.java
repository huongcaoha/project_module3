package com.ra.base_spring_mvc.model.service.category;

import com.ra.base_spring_mvc.model.dao.category.CategoryDAO;
import com.ra.base_spring_mvc.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDAO categoryDAO ;
    @Override
    public List<Category> getListCategory() {
        return categoryDAO.getListCategory();
    }

    @Override
    public boolean addCategory(Category category) {
        return categoryDAO.addCategory(category);
    }

    @Override
    public boolean updateCategory(Category category) {
        return categoryDAO.updateCategory(category);
    }

    @Override
    public boolean deleteCategory(Category category) {
        return categoryDAO.deleteCategory(category);
    }

    @Override
    public Category findById(int id) {
        return categoryDAO.findById(id);
    }

    @Override
    public boolean checkCategoryNameExist(String categoryName) {
        List<Category> categories = getListCategory();
        return categories.stream().map(Category::getCategoryName).anyMatch(cate -> cate.equals(categoryName));
    }
}
