package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public void createTable(){
        repository.createTable();
    }

    public void addStudent(Model mod){
        repository.insertValues(mod.getId(), mod.getName(), mod.getAge());
    }

    public List<Map<String,Object>> selectAll(){
        return repository.selectAll();
    }

    public String updateStudent(int id,String name){
        int rows = repository.update(id,name);
        return rows >= 1 ? "updated successfully" : "not updated";
    }

    public String deleteStudent(int id){
        int rows = repository.delete(id);
        return rows >= 1 ? "deleted successfully" : "not deleted";
    }
}

