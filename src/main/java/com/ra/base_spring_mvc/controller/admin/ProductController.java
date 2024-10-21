package com.ra.base_spring_mvc.controller.admin;

import com.ra.base_spring_mvc.model.entity.Product;

<<<<<<< HEAD
import com.ra.base_spring_mvc.model.entity.dto.ProductDto;
=======
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
import com.ra.base_spring_mvc.model.service.category.CategoryService;
import com.ra.base_spring_mvc.model.service.product.ProductService;
import com.ra.base_spring_mvc.model.service.product.status.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
<<<<<<< HEAD
@RequestMapping("/admin/product")
=======
@RequestMapping("/product")
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private StatusService statusService;
    @GetMapping
    public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "5") int size) {

        List<Product> products = productService.findAll(page,size);
        model.addAttribute("products", products);
<<<<<<< HEAD
        model.addAttribute("isProduct", "products");
=======
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("totalPage",productService.totalPages(size));
        return "admin/product/product-management";
    }
    @GetMapping("/add")
<<<<<<< HEAD
    public String add(Model model,@ModelAttribute("products") ProductDto productDto) {
=======
    public String add(Model model,@ModelAttribute("product") Product product) {
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c

        model.addAttribute("statusList", statusService.findAll());
        model.addAttribute("categories", categoryService.getListCategory());

<<<<<<< HEAD
        model.addAttribute("products", productDto);
=======
        model.addAttribute("product", product);
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
        return "admin/product/add";
    }

    @PostMapping("/add")
<<<<<<< HEAD
    public String save(@ModelAttribute("products") ProductDto productDto, BindingResult result) {
=======
    public String save(@ModelAttribute("product") Product product, BindingResult result) {
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
        if (result.hasErrors()) {
            for (ObjectError allError : result.getAllErrors()) {
                System.out.println(allError.getDefaultMessage());
            }
            return "admin/product/add";
        }

<<<<<<< HEAD
        productService.createProduct(productDto);
        return "redirect:/admin/product";
=======
        productService.createProduct(product);
        return "redirect:/product";
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        Product product=productService.findById(id);
<<<<<<< HEAD
        ProductDto productDto = productService.converseProduct(product);
        model.addAttribute("product", productDto);
        model.addAttribute("categories", categoryService.getListCategory());
        model.addAttribute("statusList", statusService.findAll());
        model.addAttribute("image",product.getImage());

=======
        model.addAttribute("products", product);
        model.addAttribute("categories", categoryService.getListCategory());
        model.addAttribute("statusList", statusService.findAll());
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
        return "admin/product/update";
    }

    @PostMapping("/edit/{id}")
<<<<<<< HEAD
    public String update(@PathVariable int id, @ModelAttribute("product") ProductDto productDto) {
        Product oldProduct = productService.findById(id);
        Product product = productService.converseProductDto(productDto);
        if(product.getImage() == null){
            product.setImage(oldProduct.getImage());
        }
        if (productService.updateProduct(productDto)) {
            return "redirect:/admin/product";
=======
    public String update(@PathVariable int id, @ModelAttribute("product") Product product) {

        if (productService.updateProduct(product)) {
            return "redirect:/product";
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
        }
        return "admin/product/update" + id;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productService.deleteProduct(id);
<<<<<<< HEAD
        return "redirect:/admin/product";
=======
        return "redirect:/product";
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    }
    @GetMapping("/search")
    public String search(@RequestParam("search") String productName,Model model,@RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name = "size", defaultValue = "5") int size){
        List<Product> productList= productService.searchProduct(productName,page,size);
        model.addAttribute("products",productList);
        model.addAttribute("categories", categoryService.getListCategory());
        model.addAttribute("statusList", statusService.findAll());
        model.addAttribute("page",page);
        model.addAttribute("size",size);
<<<<<<< HEAD
        model.addAttribute("isSearch",productName);
        model.addAttribute("totalPage",productService.totalSearchPages(size, productName));
       return "admin/product/product-management";
    }
    @GetMapping("/sort")
    public String sort(Model model,@RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name = "size", defaultValue = "5") int size){

        List<Product> productList= productService.sortProduct(page,size);
        model.addAttribute("products",productList);
        model.addAttribute("categories", categoryService.getListCategory());
        model.addAttribute("statusList", statusService.findAll());
        model.addAttribute("page",page);
        model.addAttribute("size",size);
        model.addAttribute("isSort","productList");
        model.addAttribute("totalPage",productService.totalPages(size));
        return "admin/product/product-management";
    }
=======
        model.addAttribute("totalPage",productService.totalPages(size));
       return "admin/product/product-management";
    }

>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
