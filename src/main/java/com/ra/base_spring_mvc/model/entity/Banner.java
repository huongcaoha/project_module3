package com.ra.base_spring_mvc.model.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
=======
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "banners")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bannerName;
<<<<<<< HEAD

=======
    private String content ;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    private String image ;
    private String location ;
}
