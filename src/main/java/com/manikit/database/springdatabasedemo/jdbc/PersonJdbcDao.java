package com.manikit.database.springdatabasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.manikit.database.springdatabasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll(){
		return jdbcTemplate.query("select * from person", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(Long i){
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{i},
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	
}
