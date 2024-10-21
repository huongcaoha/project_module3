package com.ra.base_spring_mvc.model.entity;

import lombok.*;

import java.util.Date;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.Set;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c


import javax.persistence.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;

<<<<<<< HEAD

=======
    @OneToMany(mappedBy = "product")
    private List<ProductDetail> productDetails;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c

    @Column(name = "product_name",unique = true)
    @NotBlank(message = "Product name can not blank !")
    private String productName;

<<<<<<< HEAD
    private String image;

    @ManyToOne()
    @JoinColumn(name = "category_id")
=======

    @ManyToOne()
    @JoinColumn(name = "category_id")

>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    private Category category;

    private Date created_at = new Date();

    private Date updated_at ;

    private String description;


}
