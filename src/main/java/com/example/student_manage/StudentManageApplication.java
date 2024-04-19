package com.example.student_manage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentManageApplication {
        public static void main(String[] args) {

                ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


                System.out.println("Student Service");
                // Utilisation de getBean() avec le nom du bean pour spécifier quel bean utiliser
                StudentService studentService = context.getBean("studentService", StudentService.class);


                // Utilisation des méthodes du service
                Student student1 = new Student(1L, "Alice", "Mathematics");
                Student student2 = new Student(2L, "Bob", "Physics");

                // Création d'étudiants
                studentService.createStudent(student1);
                studentService.createStudent(student2);

                // Recherche d'un étudiant par ID
                Student foundStudent = studentService.findStudentById(1L);
                System.out.println("Found Student: " + foundStudent);

                // Affichage de tous les étudiants
                System.out.println("All Students:");
                studentService.displayAllStudents();
                System.out.println("----------------------------------------------------");
                // Ajout d'une autre injection pour tester StudentServiceMock
                System.out.println("Student Service Mock");
                StudentService studentServiceMock = context.getBean(StudentServiceMock.class);

                Student student3 = new Student(5L, "John Doe", "Computer Science");
                studentServiceMock.createStudent(student3);

                System.out.println("Found Student(Mock): " + studentServiceMock.findStudentById(5L));


                System.out.println("---------------------------------------------------------");
                System.out.println("Student Repository in memory");
                StudentRepository studentRepository = context.getBean(InMemoryStudentRepository.class);

                
                Student student6 = new Student(6L, "Jowel", "ALM");
                Student student7 = new Student(7L, "SAMI", "ALW");

                studentRepository.save(student6);
                studentRepository.save(student7);

                // Récupération d'un étudiant par son ID
                Student foundStudentMem = studentRepository.findById(1L);
                System.out.println("Found StudentMem: " + foundStudentMem);

                // Affichage de tous les étudiants
                System.out.println("All Students:");
                studentRepository.findAll().forEach(System.out::println);
        }



        }

