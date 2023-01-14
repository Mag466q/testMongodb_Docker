package com.example.app.testmongodb_docker.controller;

import com.example.app.testmongodb_docker.Model.Student;
import com.example.app.testmongodb_docker.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {


    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student>  students = studentService.findAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable("id") String id){
        Student student =studentService.findStudentById(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudnet(@RequestBody Student student){
        Student newstudent = studentService.addStudent(student);
        return new ResponseEntity<>(newstudent,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudnet(@RequestBody Student student){
        Student updaetstudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updaetstudent,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudnet(@PathVariable("id") String id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
