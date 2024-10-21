package com.ra.base_spring_mvc.model.dao.banner;

import com.ra.base_spring_mvc.model.entity.Banner;

import java.util.List;

public interface BannerDAO {
    List<Banner> getListBanner();
    List<Banner> getListPagination(int page , int size);
    boolean addBanner(Banner banner);
    boolean updateBanner(Banner banner);
    boolean deleteBanner(Banner banner);
    Banner findById(int id);
<<<<<<< HEAD
=======
    Banner getBannerByLocation(String location);
>>>>>>> b3fc89ae957013758c6fc607fb903f8ef0aada5c
}
