package com.ra.base_spring_mvc.model.dao.productdetail;


import com.ra.base_spring_mvc.model.entity.ProductDetail;

import java.util.List;

public interface ProductDetailDAO {


    List<ProductDetail> findAll();

    List<ProductDetail> findByProductId(int id);

    ProductDetail findById(int id);

    boolean createProduct(ProductDetail productDetail);

    boolean updateProduct(ProductDetail productDetail);

    void deleteProduct(int id);

<<<<<<< HEAD
    ProductDetail findByColorIdSizeId(int colorId,int sizeId);

=======
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
