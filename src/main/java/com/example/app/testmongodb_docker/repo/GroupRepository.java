package com.example.app.testmongodb_docker.repo;

import com.example.app.testmongodb_docker.Model.Group;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository  extends MongoRepository<Group,String> {

}
