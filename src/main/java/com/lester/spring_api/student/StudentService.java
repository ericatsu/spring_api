package com.lester.spring_api.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                    1L, 
                    "Eric", 
                    "eric@gmail.com", 
                    LocalDate.of(1999, Month.SEPTEMBER, 03), 
                    23
                )
            );
    }
}
