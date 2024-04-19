package com.example.student_manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
      studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        for (Student student : studentRepository.findAll()) {
            System.out.println(student);
        }
    }
}
