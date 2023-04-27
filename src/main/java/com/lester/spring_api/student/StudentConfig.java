package com.lester.spring_api.student;

import static java.time.Month.SEPTEMBER;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student eric = new Student( 
                    "Eric", 
                    "eric@gmail.com", 
                    LocalDate.of(1999, SEPTEMBER, 03), 
                    23
                );

            Student atsu = new Student(
                    "Atsu",
                    "atsu@gmail.com",
                    LocalDate.of(2002, SEPTEMBER, 03),
                    23);

            repository.saveAll(
                List.of(eric, atsu)
            );
        };
    }
}
