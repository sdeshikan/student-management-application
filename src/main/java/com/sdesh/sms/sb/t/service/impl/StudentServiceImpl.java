package com.sdesh.sms.sb.t.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sdesh.sms.sb.t.entity.Student;
import com.sdesh.sms.sb.t.repository.StudentRepository;
import com.sdesh.sms.sb.t.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    
}
