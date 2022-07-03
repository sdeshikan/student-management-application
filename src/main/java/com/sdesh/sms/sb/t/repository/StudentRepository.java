package com.sdesh.sms.sb.t.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdesh.sms.sb.t.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
