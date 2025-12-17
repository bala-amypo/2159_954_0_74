package com.example.demo.repository;
import org.spring framework.data.jpa.repository.JpaRepository;
import org.spring framework.streotype.Repository;
import com.example.demo.entity.Student;
@Repository
public interface Studentrepo extends JpaRepository<Student,Long>{}