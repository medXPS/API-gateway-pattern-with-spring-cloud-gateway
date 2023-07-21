package com.microservices.service2.controller;

import com.microservices.service2.external.Item;
import com.microservices.service2.service.SVC_2_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/svc-2/api")
public class SVC_2_Controller {
    @Autowired
    private SVC_2_Service svc2Service;

    @GetMapping("/getItems")
    public ResponseEntity<List<Item>> getItems(){
        return new ResponseEntity<>( svc2Service.getItems(), HttpStatus.OK);

    }

}
