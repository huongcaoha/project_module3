package com.ra.base_spring_mvc.model.service.file;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class FileService {
    @Autowired
    private Cloudinary cloudinary;

    public String uploadImage(MultipartFile multipartFile){
        if (multipartFile == null || multipartFile.isEmpty()) {
            return null;
        }
        try {
            Map upload = cloudinary.uploader().upload(
                    multipartFile.getBytes(),
                    ObjectUtils.asMap(
                            "resource_type", "image"
                    )
            );
            Object url = upload.get("secure_url");
            if (url == null) {
                url = upload.get("url");
            }
            return url == null ? null : url.toString();
        } catch (IOException e) {
            throw new RuntimeException("Upload failed: " + e.getMessage(), e);
        }
    }
}
