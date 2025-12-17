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

    @GetMapping("/{id}")
    public Studentity getStudent(@PathVariable int id){
        return ser.getAll();
    }
    @GetMapping("/all")
    public Collection<Studentity>getAllStudents(){
        return ser.getAll();
    }
    @PutMapping("/update/{id}")
    public Studentity updateStudent(@PathVariable int id,@RequestBody Studentity st){
        Studentity updated = ser.updateStudent(id,st);
        if(updated!=null){
            return updated;
        }else{
            throw new RuntimeException("Student with ID "+id+"not found");
        }
    }
}