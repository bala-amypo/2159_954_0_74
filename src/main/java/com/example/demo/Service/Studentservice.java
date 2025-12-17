package com.example.demo.Service;

import.java.util.HashMap;
import java.util.Map;
import org.springframework.streotype.Service;

import com.example.demo.Entity.StudEntity;

@Service
public class Studentservice{
    Map<Integer,Studentity> details =new HashMap<>();

    public Studentity saveData(Studentity st){
        details.put(st.getid(),st);
        return st;
    }
    pblic Studentity getStudent(int id){
        return details.get(id);
    }
    public Map<integer,Studentity>getAllStudents(){
        return details;
    }
    public Studentity updateStudent(int id,Studentity st)
}