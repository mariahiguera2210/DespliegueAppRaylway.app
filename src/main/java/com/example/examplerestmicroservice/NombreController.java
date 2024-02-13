package com.example.examplerestmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/name")
public class NombreController {

    @GetMapping
    public String getName(){
        return  "<h1> Mi nombre es Maria</h1>";
    }
}
