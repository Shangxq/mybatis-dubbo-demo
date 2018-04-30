package com.shang.dubbo.demo.controller;

import com.shang.dubbo.demo.service.impl.StudentServiceFromDubbo;
import com.shang.api.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentServiceFromDubbo studentServiceFromDubbo;

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable Long id){
        return studentServiceFromDubbo.getStudent(id);
    }
    @GetMapping("hello")
    public String hello(){
        String ni="ni";
        return ni+"hello";
    }
}
