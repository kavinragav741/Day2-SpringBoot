package com.example.springboot.Services;

import org.springframework.stereotype.Service;

@Service
public class HelloServices {
    public String getmethod(){
        return "get method called successfully";
    }
    public String Putmethod(){
        return "put method called";
    }
    public String Deletemethod(){
        return "delete method called ";
    }

}
