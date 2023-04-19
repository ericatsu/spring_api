package com.lester.spring_api;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lester.spring_api.student.Student;

@SpringBootApplication
@RestController
public class SpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Eric", "eric@gmail.com", LocalDate.of(1999, Month.SEPTEMBER, 03), 23));
	}
}
