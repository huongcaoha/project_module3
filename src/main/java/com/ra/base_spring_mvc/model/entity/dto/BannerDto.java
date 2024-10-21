package com.ra.base_spring_mvc.model.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BannerDto {
    private String bannerName;
    @NotNull(message = "file not null !")
    private MultipartFile image ;
    private String location ;
}
