package com.example.mealkhu2.controller;

import com.example.mealkhu2.document.SeoulRest;
import com.example.mealkhu2.repository.MongoDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SeoulController {

    @Autowired
    private MongoDbRepository mongorepo;

    @GetMapping("/api/seoul")
    public Object getSeoul(Model model){
        List<SeoulRest> result = mongorepo.findAll();
        return result;
    }
}
