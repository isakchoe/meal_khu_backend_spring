package com.example.mealkhu2.controller;

import java.util.List;

import com.example.mealkhu2.document.GlobalRest;
import com.example.mealkhu2.repository.MongoDbRepositoryGlobal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalController {

    @Autowired
    private MongoDbRepositoryGlobal mongorepo;

    @GetMapping("/global")
    public Object getGlobal(){
        List<GlobalRest> result = mongorepo.findAll();
        return result;
    }
}
