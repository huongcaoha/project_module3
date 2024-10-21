package com.ra.base_spring_mvc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
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
    private double persent ;

    @Min(0)
    private double min_amount;

    @Min(0)
    @NotNull(message = "quantity can not null !")
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date ;

}
