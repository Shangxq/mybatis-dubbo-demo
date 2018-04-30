package com.shang.api.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
    private Long id;

    private String name;

    private int age;

    private int grade;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }
}
