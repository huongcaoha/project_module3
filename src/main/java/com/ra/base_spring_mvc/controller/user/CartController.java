package com.ra.base_spring_mvc.controller.user;

import com.ra.base_spring_mvc.model.entity.ShoppingCart;
import com.ra.base_spring_mvc.model.service.ShoppingCart.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    @GetMapping
    public String displayCart(Model model){
        List<ShoppingCart> shoppingCarts = shoppingCartService.getListShoppingCart(1);

        model.addAttribute("shoppingCarts", shoppingCarts);
        return "user/cart/displayCart";
    }

    @PostMapping("/addToCart")
    public String addToCart(){
        return "";
    }

    @GetMapping("/up/{id}")
    public String up(@PathVariable int id){
        ShoppingCart shoppingCart = shoppingCartService.findById(id);
        shoppingCart.setQuantity(shoppingCart.getQuantity()+1);
        shoppingCartService.updateTocart(shoppingCart);
        return "redirect:/cart";
    }

    @GetMapping("/down/{id}")
    public String down(@PathVariable int id){
        ShoppingCart shoppingCart = shoppingCartService.findById(id);
        shoppingCart.setQuantity(shoppingCart.getQuantity()-1);
        shoppingCartService.updateTocart(shoppingCart);
        return "redirect:/cart";
    }


}
