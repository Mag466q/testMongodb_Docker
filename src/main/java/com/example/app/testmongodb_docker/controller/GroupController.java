package com.example.app.testmongodb_docker.controller;

import com.example.app.testmongodb_docker.Model.Group;
import com.example.app.testmongodb_docker.service.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> getGroupByID(@PathVariable("id") Long id){
        Group group =groupService.findGroupByID(id);
        return new ResponseEntity<>(group, HttpStatus.OK);
    }


    @GetMapping("")
    public ResponseEntity<List<Group>> getAllStudents(){
        List<Group>  students = groupService.findAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

}
