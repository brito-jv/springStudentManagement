@package com.example.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@ResponseBody
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@PostMapping("/addStudents")
	public List<Student> addStudent(@RequestBody List<Student> students) {
		return service.saveStudents(students);
	}
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.findStudent(id);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents( ) {
		return service.findStudents();
	}
	
	@PutMapping("/updateStudent")
	public Student updateS(@RequestBody Student stud) {
		return service.updateStudent(stud);
	}
	@DeleteMapping("/deleteStudent/{idr}")
	public String deletes(@PathVariable int idr) {
		service.deletStudent(idr);
		return "success";
	}
	
	@RequestMapping("/welcome")
	
	public String welcome() {
		return "about.html";
	}
	

}
