package com.microservices.service1.service;

import com.microservices.service1.entity.Item;
import com.microservices.service1.model.ItemRequest;
import com.microservices.service1.repository.SVC_1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SVC_1_ServiceImpl implements  SVC_1_Service{
    @Autowired
    SVC_1_Repository svc1Repository;
    @Override
    public void saveItem(ItemRequest itemRequest) {
        Item item= Item.builder().item(itemRequest.getItem()).build();
        svc1Repository.save(item);


    }

    @Override
    public List<Item> getItems() {
        return  svc1Repository.findAll();

    }
}
