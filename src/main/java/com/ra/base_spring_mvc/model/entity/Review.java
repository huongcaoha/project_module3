package com.ra.base_spring_mvc.model.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import lombok.*;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

<<<<<<< HEAD
@Data
=======
@Getter
@Setter
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user ;

    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "id")
    private Product product ;

    private int rate ;

    private String content ;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date created_at = new Date();
}
