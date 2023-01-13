package com.example.app.testmongodb_docker.service;

import com.example.app.testmongodb_docker.Model.Student;
import com.example.app.testmongodb_docker.exception.StudentNotFoundException;
import com.example.app.testmongodb_docker.repo.GroupRepository;
import com.example.app.testmongodb_docker.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;
    private final GroupService groupService ;


    @Autowired
    public StudentService(StudentRepository studentRepository, GroupRepository groupRepository,GroupService groupService) {
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
        this.groupService = groupService;
    }


    //TODO Rozszerzyc by dodawało grupe po id
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAllStudent(){

        return studentRepository.findAll();
    }

    public Student updateStudent (Student student){
        return studentRepository.save(student);
    }

    public Student findStudentById (Long id){
        return studentRepository.findById(id)
                .orElseThrow(() ->  new StudentNotFoundException("User by id"+ id + "not found"));
    }

    public void deleteStudent (Long id){
        studentRepository.deleteById(id);
    }
}
