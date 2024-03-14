package com.codigofacilito.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/hola")
    public String hola(){
        return "¡Hola Maven desde SpringBoot!";
    }
}