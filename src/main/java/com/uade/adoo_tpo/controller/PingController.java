package com.uade.adoo_tpo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ping")
public class PingController {

    @GetMapping
    public String index(){
        return "pong";
    }
}
