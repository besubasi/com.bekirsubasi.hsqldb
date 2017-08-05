package com.bekirsubasi.hsqldb;

import com.bekirsubasi.hsqldb.domain.City;
import com.bekirsubasi.hsqldb.domain.District;
import com.bekirsubasi.hsqldb.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HsqldbApplicationTests {

	private EmbeddedDatabase embeddedDatabase;
	private JdbcTemplate jdbcTemplate;

	@Before
	public void setUp() {
		// creates an HSQL in-memory database populated from default scripts
		// classpath:schema.sql and classpath:data.sql
		this.embeddedDatabase = new EmbeddedDatabaseBuilder()
				.generateUniqueName(true)
				.addDefaultScripts()
				.build();

		this.jdbcTemplate = new JdbcTemplate(this.embeddedDatabase);
	}


	@Test
	public void testTablePrint() {
		List<Student> studentList =  this.jdbcTemplate.query("select student_id,name,surname from student ", new BeanPropertyRowMapper(Student.class));
		List<City> cityList =  this.jdbcTemplate.query("select city_id,name from city ", new BeanPropertyRowMapper(City.class) );
		List<District> districtList =  this.jdbcTemplate.query("select district_id, city_id,name from district ", new BeanPropertyRowMapper(District.class));

		System.out.println("Students : "+studentList);
		System.out.println("Cities : "+cityList);
		System.out.println("Districts : "+districtList);


	}

	@After
	public void tearDown() {
		this.embeddedDatabase.shutdown();
	}


}
