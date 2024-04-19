package com.example.student_manage;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryStudentRepository implements StudentRepository {
    private final Map<Long, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(Long id) {
        return students.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}
