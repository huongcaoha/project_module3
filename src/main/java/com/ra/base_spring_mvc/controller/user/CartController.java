package com.ra.base_spring_mvc.controller.user;

import com.ra.base_spring_mvc.model.entity.Product;
import com.ra.base_spring_mvc.model.entity.ProductDetail;
import com.ra.base_spring_mvc.model.entity.ShoppingCart;
import com.ra.base_spring_mvc.model.service.ShoppingCart.ShoppingCartService;
import com.ra.base_spring_mvc.model.service.product.ProductService;
import com.ra.base_spring_mvc.model.service.productdetail.color.ColorService;
import com.ra.base_spring_mvc.model.service.productdetail.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private final ShoppingCartService shoppingCartService;
    @Autowired
    private final ColorService colorService;
    @Autowired
    private final ProductService productService;
    @Autowired
    private final SizeService sizeService;

    public CartController(ShoppingCartService shoppingCartService, ColorService colorService, ProductService productService, SizeService sizeService) {
        this.shoppingCartService = shoppingCartService;
        this.colorService = colorService;
        this.productService = productService;
        this.sizeService = sizeService;
    }

    @GetMapping
    public String displayCart(Model model){
        List<ShoppingCart> shoppingCarts = shoppingCartService.getListShoppingCart(1);

        model.addAttribute("shoppingCarts", shoppingCarts);
        return "user/cart/displayCart";
    }

//    @PostMapping("/addToCart")
//    public String addToCart(@RequestParam("productId") int id,
//                            @RequestParam("quantity") int quantity , @RequestParam("size") int size
//                            , @RequestParam("color") int color){
//        Product product = productService.findById(id);
//        ProductDetail productDetail = new ProductDetail();
//        productDetail.setColor(colorService.findById(color));
//        productDetail.setSize(sizeService.findById(size));
//        productDetail.setStock_quantity(quantity);
//        productDetail.setProduct(product);
//        productDetail.set
//        return "";
//    }

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
