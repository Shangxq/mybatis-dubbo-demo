package com.shang.mybatis.demo.service.impl;

import com.shang.mybatis.demo.domain.Student;
import com.shang.mybatis.demo.mapper.StudentMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.shang.api.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.shang.api.service.StudentService;

@Service
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentDTO getStudent(final Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
