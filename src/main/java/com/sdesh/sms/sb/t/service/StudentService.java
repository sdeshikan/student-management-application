package com.sdesh.sms.sb.t.service;

import java.util.List;

import com.sdesh.sms.sb.t.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);

    Student getStudentById(Long id);
}
