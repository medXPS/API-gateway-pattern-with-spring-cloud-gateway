package com.microservices.service2.service;

import com.microservices.service2.external.Item;
import com.microservices.service2.external.SVC_1_Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SVC_2_ServiceImpl  implements  SVC_2_Service{
    @Autowired
    private SVC_1_Client svc1Client;



    @Override
    public List<Item> getItems() {
        ResponseEntity<List<Item>> response = svc1Client.getItems();
        List<Item> items = response.getBody();
        return items;
    }
}
