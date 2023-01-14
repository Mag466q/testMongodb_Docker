package com.example.app.testmongodb_docker.repo;

import com.example.app.testmongodb_docker.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
