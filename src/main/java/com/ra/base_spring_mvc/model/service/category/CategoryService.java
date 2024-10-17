package com.ra.base_spring_mvc.model.service.category;

import com.ra.base_spring_mvc.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getListCategory();
    boolean addCategory(Category category);
    boolean updateCategory(Category category);
    boolean deleteCategory(Category category);
    Category findById(int id);
    boolean checkCategoryNameExist(String categoryName);
}
