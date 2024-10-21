package com.ra.base_spring_mvc.model.entity.dto;

import com.ra.base_spring_mvc.model.entity.Color;
import com.ra.base_spring_mvc.model.entity.Product;
import com.ra.base_spring_mvc.model.entity.Size;
import com.ra.base_spring_mvc.model.entity.Status;
import com.ra.base_spring_mvc.validator.category.CategoryNameUnique;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import lombok.*;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

<<<<<<< HEAD
@Data
=======
@Getter
@Setter
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailDto {
    private int id;
    private String sku ;
    private double unit_price;

    private int stock_quantity;

    private MultipartFile fileImage;

    private Status status;

    private int productId;

    private Color color;

    private Size size;
}
