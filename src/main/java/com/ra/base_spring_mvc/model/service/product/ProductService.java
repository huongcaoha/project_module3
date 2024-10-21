package com.ra.base_spring_mvc.model.service.product;

import com.ra.base_spring_mvc.model.entity.Product;
<<<<<<< HEAD
import com.ra.base_spring_mvc.model.entity.dto.ProductDto;
=======
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c

import java.util.List;

public interface ProductService {
    List<Product> findAll(int page, int size);

    List<Product> findAll();

    List<Product> searchProduct(String productName,int page, int size);

    double totalPages(int size);

    Product findById(int id);

<<<<<<< HEAD
    boolean createProduct(ProductDto productDto);

    boolean updateProduct(ProductDto productDto);

    void deleteProduct(int id);

    double totalSearchPages(int size,String productName);

    List<Product> sortProduct(int page, int size);

    Product converseProductDto(ProductDto productDto);

    ProductDto converseProduct(Product product);
=======
    boolean createProduct(Product product);

    boolean updateProduct(Product product);

    void deleteProduct(int id);
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
