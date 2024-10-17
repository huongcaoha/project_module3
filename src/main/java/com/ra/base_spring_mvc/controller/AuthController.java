package com.ra.base_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AuthController
{
    @GetMapping
    public String index(){
        return "admin/dashboard";
    }


}
