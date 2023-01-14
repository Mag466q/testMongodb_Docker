package com.example.app.testmongodb_docker.Model;


import com.example.app.testmongodb_docker.Model.enums.GenderE;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document
@Data

public class Student {

    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private GenderE gender;
    private Address address;
    private Group groupId;

    public Student(String firstName, String lastName, String email, GenderE gender, Address address, Group groupId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.groupId = groupId;
    }
}
