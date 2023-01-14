package com.example.app.testmongodb_docker.controller;

import com.example.app.testmongodb_docker.Model.Group;

import com.example.app.testmongodb_docker.service.GroupService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }


    @GetMapping("")
    public ResponseEntity<List<Group>> getAllGroups(){
        List<Group>  groups = groupService.findAllGroup();
        return new ResponseEntity<>(groups, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Group> getGroupByID(@PathVariable("id") String id){
        Group group =groupService.findGroupByID(id);
        return new ResponseEntity<>(group, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Group> addGroup(@RequestBody Group group){
        Group newgroup = groupService.addGroup(group);
        return new ResponseEntity<>(newgroup,HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Group> updateGroup(@RequestBody Group group) {
        Group updaetstudent = groupService.updateGroup(group);
        return new ResponseEntity<>(updaetstudent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable("id") String id){
        groupService.deleteGroup(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
