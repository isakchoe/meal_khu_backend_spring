package com.example.mealkhu2.repository;

import com.example.mealkhu2.document.GlobalRest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDbRepositoryGlobal extends MongoRepository<GlobalRest, String> {
    public GlobalRest findAllBy(String id);
}
