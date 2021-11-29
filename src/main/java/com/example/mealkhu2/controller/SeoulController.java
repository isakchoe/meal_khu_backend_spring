package com.example.mealkhu2.controller;

import com.example.mealkhu2.document.SeoulRest;
import com.example.mealkhu2.repository.MongoDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
public class SeoulController {

    @Autowired
    private MongoDbRepository mongorepo;

    @GetMapping("/api/seoul")
    public Object getSeoul(Model model){
//        System.out.println(mongorepo.findAllBy("파파이스경희의료원점")
        List<SeoulRest> result = mongorepo.findAll();

//        model.addAttribute("list", result);
//        System.out.println(result);
//        System.out.println(result.size());
//        return "seoul";
        return result;
    }
}
