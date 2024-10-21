package com.ra.base_spring_mvc.model.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import lombok.*;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c

import javax.persistence.*;
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
@Entity
@Table(name = "colors")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "color_name",unique = true)
    @NotBlank(message = "Product name can not blank !")
    private String colorName;
    private boolean status ;
}
