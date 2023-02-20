package com.example.student.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.system.StudentRepository.StudentRepository;
import com.example.student.system.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        // TODO Auto-generated method stub
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Auto-generated method stub
        return studentRepository.findAll();
    }
    
}
