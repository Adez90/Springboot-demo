package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.Repository;
import org.dom4j.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Testcontroller {
    private static final String greeting = "Hello World!";

    @Autowired
    Repository repository;

    @PostMapping("/post/user")
    public String helloWorld(@RequestBody String requestBody){
        String[] data = requestBody.split("\\s+");

        User user = new User(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3]);
        //Blablabalbalabla /Olle
        repository.save(user);

        return String.valueOf(user.getId());
    }

    @GetMapping("/get/user")
    public String getRequest(@RequestParam("ssn") String ssn ) {
        return repository.findFirstBySsn(Integer.parseInt(ssn)).toString();
    }
}
