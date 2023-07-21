package com.microservices.service1.service;

import com.microservices.service1.entity.Item;
import com.microservices.service1.model.ItemRequest;

import java.util.List;

public interface SVC_1_Service {
    void saveItem(ItemRequest itemRequest);

    List<Item> getItems();
}
