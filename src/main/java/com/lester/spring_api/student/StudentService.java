package com.lester.spring_api.student;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;
    
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    
    public void addNewStudent(Student student) {
        studentRepository.save(student);
    }
}
