
package com.example.student.system.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.system.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}