package com.example.student_manage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Primary
@Service
public class StudentServiceMock implements StudentService {

    @Override
    public void createStudent(Student student) {
        // Créer un nouvel étudiant à partir des données passées en paramètre
        Student newStudent = new Student(student.getId(), student.getName(), student.getField());


        System.out.println("Student created (Mock): " + newStudent);



    }
    @Override
    public Student findStudentById(Long id) {
        // Retourne un étudiant fictif avec l'ID spécifié
        return new Student(id, "John Doe", "Computer Science");
    }

    @Override
    public void displayAllStudents() {
        // Affiche une liste fictive d'étudiants
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Alice", "Mathematics"));
        students.add(new Student(2L, "Bob", "Physics"));
        students.add(new Student(3L, "Charlie", "Biology"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
