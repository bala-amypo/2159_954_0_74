package com.example.project1.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studentity;
import com.example.demo.services.Studservice;

@RestController
@RequestMapping("/student")
public class Studctl{
    @Autowired
    Studservice ser;
    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);
    }

    @GetMapping9)
}