package com.example.student_manage;




public class Student {
    private Long id;
    private String name;
    private String field;

    public Student() {

    }

    public Student(Long id, String name,  String field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getField() {
        return field;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
