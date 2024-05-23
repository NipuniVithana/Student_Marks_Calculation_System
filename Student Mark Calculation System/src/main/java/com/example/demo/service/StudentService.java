package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    void insertStudent(Student student);

    List<Student> getStudentsMark();
}
