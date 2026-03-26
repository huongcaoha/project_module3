package com.ra.base_spring_mvc.common;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Component
public class MethodCommon {

    @Autowired
    private Cloudinary cloudinary; // Bỏ static ở đây

    public String uploadImage(MultipartFile file) { // Bỏ static ở đây
        if(file != null && !file.isEmpty()){
            try {
                Map upload = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
                return upload.get("url").toString();
            } catch (IOException e) {
                throw new RuntimeException("Upload failed: " + e.getMessage());
            }
        }
        return null;
    }
}