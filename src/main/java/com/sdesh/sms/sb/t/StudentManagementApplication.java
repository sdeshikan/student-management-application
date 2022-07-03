package com.sdesh.sms.sb.t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sdesh.sms.sb.t.entity.Student;
import com.sdesh.sms.sb.t.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Lucy", "Cechtelar", "Lucy.Cechtelar@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Adaline", "Reichel", "Adaline.Reichel@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Emmett", "Lebsack", "Emmett.Lebsack@gmail.com");
		studentRepository.save(student3);

		Student student4 = new Student("Keegan", "Thiel", "Keegan.Thiel@gmail.com");
		studentRepository.save(student4);
 

		
	}
 

}
