package com.lester.spring_api.student;
import java.util.List;
import java.util.Optional;

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
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            try {
                throw new IllegalAccessException("student with id" + studentId + "does not exist");
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        studentRepository.deleteById(studentId);
    }
}
