//Uses StudentService to get the necessary data

package com.example.firstProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")


public class StudentController {
    private final StudentService studentService;


    @Autowired //constructor injection
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    //handles Get requests,by default @GetMapping maps to base url as there is no url specified
    @GetMapping
    public List<com.example.firstProject.student.Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    //take request body and map in to Student
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}




