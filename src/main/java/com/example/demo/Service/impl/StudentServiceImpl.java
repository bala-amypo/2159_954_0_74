package com.example.demo.Service.impl;
import java.util.*;
import org.springframework.streotype.Service;
import com.example.demo.Entity.student;

@Service
public class StudentServiceimpl implements StudentService{
    private final Map<Long,Student>store=new HashMap<>();
    private long counter
}