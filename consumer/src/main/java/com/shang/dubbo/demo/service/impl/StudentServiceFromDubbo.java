package com.shang.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shang.api.dto.StudentDTO;
import com.shang.api.service.StudentService;

@org.springframework.stereotype.Service
public class StudentServiceFromDubbo {
    @Reference
    private StudentService studentService;

    public StudentDTO getStudent(Long id){
        return  studentService.getStudent(id);
    }
}
