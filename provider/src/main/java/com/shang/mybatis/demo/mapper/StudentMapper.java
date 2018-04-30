package com.shang.mybatis.demo.mapper;

import java.util.List;

import com.shang.api.dto.StudentDTO;
import com.shang.mybatis.demo.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

	/**
	 * 基于注解的写法
	 * @return
	 */
	@Select("SELECT * FROM student")
	List<Student> findAll();

	/**
	 * 基于配置文件的写法
	 * @param id
	 * @return
	 */
	StudentDTO selectByPrimaryKey(Long id);

	/**
	 * 基于配置文件的写法
	 * @param skip
	 * @param pageSize
	 * @return
	 */
	List<Student> findPage(@Param("skip") int skip, @Param("pageSize") int pageSize);

	int deleteByPrimaryKey(Long id);

	int insert(Student student);

	int updateByPrimaryKey(Student student);
}
