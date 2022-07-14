package com.example.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students) {
		return repo.saveAll(students);
	}
	
	public Student findStudent(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Student> findStudents() {
		return repo.findAll();
	}
	
	public Student updateStudent(Student st1) {
		
		return repo.save(st1);
	}
	public String deletStudent(int stid) {
		repo.deleteById(stid);
		return "succesfully deleted student with Id ";
	}
	
	

}
