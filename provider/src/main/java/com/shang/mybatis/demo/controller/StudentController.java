package com.shang.mybatis.demo.controller;

import com.shang.mybatis.demo.domain.Student;
import com.shang.mybatis.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentMapper studentMapper;

//	@GetMapping
//	public List<Student> findAll() {
//		try {
//			return studentMapper.findAll();
//		} catch (Exception e) {
//
//			throw new RuntimeException("发生异常");
//		} finally {
//
//		}
//	}

//	@GetMapping("/page")
//	public List<Student> page(@RequestParam int skip, @RequestParam int pageSize) {
//		SqlSession session = sqlSessionFactory.openSession();
//		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		try {
//			return studentMapper.findPage(skip, pageSize);
//		} catch (Exception e) {
//			session.rollback();
//			throw new RuntimeException("发生异常");
//		} finally {
//			session.close();
//		}
//	}
//
//	@GetMapping("/{id}")
//	public Student get(@PathVariable Long id) {
//		SqlSession session = sqlSessionFactory.openSession();
//		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		try {
//			Student student = studentMapper.selectByPrimaryKey(id);
//			System.out.println(student);
//			return student;
//		} catch (Exception e) {
//			session.rollback();
//			throw new RuntimeException("发生异常");
//		} finally {
//			session.close();
//		}
//	}
//
	@PostMapping
	@Transactional
	public void create(@RequestBody Student student) {
		for(int i=0;i<10;i++){
			studentMapper.insert(student);
		}
		throw new RuntimeException("aaa");
	}

//	@PutMapping
//	public Student update(@RequestBody Student student) {
//		SqlSession session = sqlSessionFactory.openSession();
//		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		try {
//			studentMapper.updateByPrimaryKey(student);
//			System.out.println(student);
//			session.commit();
//			return student;
//		} catch (Exception e) {
//			session.rollback();
//			throw new RuntimeException("发生异常");
//		} finally {
//			session.close();
//		}
//	}
//
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable Long id) {
//		SqlSession session = sqlSessionFactory.openSession();
//		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		try {
//			studentMapper.deleteByPrimaryKey(id);
//			session.commit();
//		} catch (Exception e) {
//			session.rollback();
//			throw new RuntimeException("发生异常");
//		} finally {
//			session.close();
//		}
//	}
}
