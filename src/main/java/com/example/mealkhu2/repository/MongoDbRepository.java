package com.example.mealkhu2.repository;

import com.example.mealkhu2.document.SeoulRest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface MongoDbRepository extends MongoRepository<SeoulRest, String> {

    public SeoulRest findAllBy(String id);
}

