package com.ra.base_spring_mvc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    private String sku = UUID.randomUUID().toString();

    @Column(name = "product_name",unique = true)
    @NotBlank(message = "Product name can not blank !")
    private String productName;

    private String description ;
    private double unitPrice ;
    @Min(0)
    private int stockQuantity ;
    private String image;
    @ManyToOne()
    @JoinColumn(name = "cate_id", referencedColumnName = "id")
    private Category category;

    private Date created_at = new Date();

    private Date updated_at ;
}
