package com.ra.base_spring_mvc.model.service.ShoppingCart;

import com.ra.base_spring_mvc.model.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCart> getListShoppingCart(long id_user);
    boolean addTocart(ShoppingCart shoppingCart);
    boolean updateTocart(ShoppingCart shoppingCart);
    boolean deleteTocart(ShoppingCart shoppingCart);
    ShoppingCart findById(int id);
}
