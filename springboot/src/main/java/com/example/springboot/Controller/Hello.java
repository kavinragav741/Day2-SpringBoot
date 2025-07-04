package com.example.springboot.Controller;

import com.example.springboot.Services.HelloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @Autowired
    HelloServices hel;

    @GetMapping("/api")
    public String getGreetings() {
        return hel.getmethod();
    }
    @PutMapping("/put")
    public String Putmethod(){
        return hel.Putmethod();
    }
    @DeleteMapping("/del")
    public String deletegreet(){
        return hel.Deletemethod();
    }
}
