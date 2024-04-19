package com.example.student_manage;

public interface StudentService {
   void createStudent(Student student);
    Student findStudentById(Long id);
    void displayAllStudents();
}
