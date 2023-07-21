package com.microservices.service1.repository;

import com.microservices.service1.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SVC_1_Repository extends JpaRepository<Item,Long> {

}
