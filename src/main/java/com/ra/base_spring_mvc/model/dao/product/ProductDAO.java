package com.ra.base_spring_mvc.model.dao.product;

import com.ra.base_spring_mvc.model.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll(int page, int size);

    List<Product> findAll();

    long totalElement();

    Product findById(int id);

    boolean createProduct(Product product);

    boolean updateProduct(Product product);

    void deleteProduct(int id);

    List<Product> searchProduct(String productName,int page, int size);
<<<<<<< HEAD

    long totalSearchElement(String productName);

    List<Product> sortProduct(int page, int size);
=======
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
