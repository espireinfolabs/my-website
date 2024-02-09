package com.demospringproject.demospringproject;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class demoController {
    
    @GetMapping("/firstAPI")
    public String firstdemoAPI(){
        return "My first demo API response";
    }

}
