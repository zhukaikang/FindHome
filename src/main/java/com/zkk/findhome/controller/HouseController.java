package com.zkk.findhome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HouseController {

    @GetMapping("/listHouse")
    public String listHouse() {
        return "hello";
    }
}
