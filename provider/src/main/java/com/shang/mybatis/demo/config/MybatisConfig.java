package com.shang.mybatis.demo.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MybatisConfig {

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(
				"jdbc:mysql://127.0.0.1/core_db?useUnicode=true&characterEncoding=utf-8&useSSL=false&autoReconnect=true");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("sm0129");
		return dataSource;
	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) {
//		TransactionFactory transactionFactory = new JdbcTransactionFactory();
//		Environment environment = new Environment("development", transactionFactory, dataSource);
//		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(
//				environment);
//		String mapperPackage = "bizfuse.mybatis.demo.mapper";
//		try {
//			List<Class<?>> mappers = listMappers(mapperPackage);
//			mappers.forEach(configuration::addMapper);
//		} catch (Exception e) {
//			configuration.addMappers(mapperPackage);
//			log.error("加载mappers失败", e);
//		}
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
//		return sqlSessionFactory;
//	}
//
//	private List<Class<?>> listMappers(String basePackage) throws IOException, ClassNotFoundException {
//		String path = basePackage.replace(".", "/");
//		ClassLoader classLoader = this.getClass().getClassLoader();
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(classLoader);
//		List<Class<?>> mappers = new ArrayList<Class<?>>();
//		for (Resource rs : resolver.getResources("classpath*:/" + path + "/**")) {
//			String file = rs.getFilename();
//			if (file.endsWith(".class")) {
//				mappers.add(classLoader.loadClass(basePackage + "." + file.substring(0, file.length() - 6)));
//			}
//		}
//		return mappers;
//	}
}
