package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/create-table")
    public  String createTable(){
        service.createTable();
        return "Table created successful";
    }

    @PostMapping("/add")
    public String add(@RequestBody Model mod){
        service.addStudent(mod);
        return "Student added successful";
    }

    @GetMapping("/all")
    public List<Map<String,Object>> getAllStudents(){
        return service.selectAll();
    }
    @PutMapping("/update/{id}/{name}")
    public String updateStudent(@PathVariable int id,@PathVariable String name){
        return service.updateStudent(id,name);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
