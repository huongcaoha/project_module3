package com.ra.base_spring_mvc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


import javax.persistence.*;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;



    @Column(name = "product_name",unique = true)
    @NotBlank(message = "Product name can not blank !")
    private String productName;

    private String image;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    private Date created_at = new Date();

    private Date updated_at ;

    private String description;


}
