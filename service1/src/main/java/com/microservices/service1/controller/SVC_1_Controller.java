package com.microservices.service1.controller;
import com.microservices.service1.entity.Item;
import com.microservices.service1.model.ItemRequest;
import com.microservices.service1.service.SVC_1_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/svc-1/api")
public class SVC_1_Controller {
    @Autowired
    private SVC_1_Service svc1Service;
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Hello from service 1", HttpStatus.OK);
    }
    @PostMapping("/addItem")
    public ResponseEntity<String> addItem(@RequestBody ItemRequest itemRequest) {
        svc1Service.saveItem(itemRequest);
        return new ResponseEntity<>("Item saved successfully", HttpStatus.OK);
    }
    @GetMapping("/getItems")
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items =svc1Service.getItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
