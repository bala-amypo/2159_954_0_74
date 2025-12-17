package com.example.demo.Service.impl;
import java.util.*;
import org.springframework.streotype.Service;
import com.example.demo.Entity.student;

@Service
public class StudentServiceimpl implements StudentService{
    private final Map<Long,Student>store=new HashMap<>();
    private long counter=1;

    @Override
    public StudentityinsertStudent(Student st){
        st.setid(counter++);
        store.put(st.getId(),st);
        return st;
    }
    @Override
    public List<Student>
    getAllStudents(){
        return new
        ArrayList<>(store.values());
    }

    @Overridepublic Optional
}