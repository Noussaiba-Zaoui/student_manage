package com.example.student_manage;
import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(Long id);
    List<Student> findAll();
}

