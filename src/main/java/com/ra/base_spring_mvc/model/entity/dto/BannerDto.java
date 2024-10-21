package com.ra.base_spring_mvc.model.entity.dto;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BannerDto {
=======
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BannerDto {

>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
    private String bannerName;
    @NotNull(message = "file not null !")
    private MultipartFile image ;
    private String location ;
<<<<<<< HEAD
=======
    private String content ;
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
