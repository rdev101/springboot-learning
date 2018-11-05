package com.rdev101.springboot.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CarController
{

    @GetMapping(value = "/api/v1/cars/{itemId}",produces = "application/json")
    public String getCars(){
        return "Cars";
    }

}
