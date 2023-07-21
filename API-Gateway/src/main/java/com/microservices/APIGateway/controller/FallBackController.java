package com.microservices.APIGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/svc1FallBack")
   public String svc1FallBack(){
        return" service 1 is currently down ";
    }
    @GetMapping("/svc2FallBack")
    public String svc2FallBack(){
        return" service 2 is currently down ";
    }

}
