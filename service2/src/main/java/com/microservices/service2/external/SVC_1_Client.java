package com.microservices.service2.external;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@CircuitBreaker(name = "external", fallbackMethod = "fallback")
@FeignClient(name = "SERVICE-1/svc-1/api")
public interface SVC_1_Client {
    @GetMapping("/getItems")
     ResponseEntity<List<Item>> getItems();
    default  String fallback(){
        return "service 1 is unavailable  " ;
    }


}
