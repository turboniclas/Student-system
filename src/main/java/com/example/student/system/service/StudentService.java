package com.example.student.system.service;

import java.util.List;

import com.example.student.system.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
