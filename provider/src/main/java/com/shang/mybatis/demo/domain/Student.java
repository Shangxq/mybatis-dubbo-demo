package com.shang.mybatis.demo.domain;

import lombok.Data;

@Data
public class Student {

	private Long id;

	private String name;

	private int age;

	private int grade;


	public String toString() {
		return String.format("{id:%s, name:%s, age:%s, grade:%s}", id, name, age, grade);
	}
}
