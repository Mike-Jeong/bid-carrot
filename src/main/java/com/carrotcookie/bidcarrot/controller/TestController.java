package com.carrotcookie.bidcarrot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/tests")
    public Boolean test(){
        System.out.println("Test has been proceed successfully");
        return true;
    }
}
