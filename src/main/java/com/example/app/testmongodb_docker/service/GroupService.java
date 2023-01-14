package com.example.app.testmongodb_docker.service;


import com.example.app.testmongodb_docker.Model.Group;
import com.example.app.testmongodb_docker.Model.Student;
import com.example.app.testmongodb_docker.exception.GroupNotFoundException;
import com.example.app.testmongodb_docker.repo.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group findGroupByID(String id){
        return groupRepository.findById(id).orElseThrow(() -> new GroupNotFoundException("Grupa o"+ id+ "nie istnieje"));
    }
    public List<Group> findAllGroup() {
        return groupRepository.findAll();
    }

    public Group addGroup(Group group) {
        return groupRepository.save(group);
    }

    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }
    public void deleteGroup(String id) {
        groupRepository.deleteById(id);
    }
}
