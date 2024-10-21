package com.ra.base_spring_mvc.model.entity.dto;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
=======
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
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
public class VoucherDto {

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

    @Min(0)
    @NotNull(message = "quantity can not null !")
    private int quantity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date ;
}
