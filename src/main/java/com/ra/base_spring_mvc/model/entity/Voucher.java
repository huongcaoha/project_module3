package com.ra.base_spring_mvc.model.entity;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
=======
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
@Table(name = "vouchers")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "code",unique = true)
    @NotBlank(message = "code can not blank !")
    private String code ;

    @NotNull(message = "persent can not null !")
<<<<<<< HEAD
=======
    @Min(1)
    @Max(100)
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    private double persent ;

    @Min(0)
    private double min_amount;

<<<<<<< HEAD
=======
    private String description ;

>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    @Min(0)
    @NotNull(message = "quantity can not null !")
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date ;

}
