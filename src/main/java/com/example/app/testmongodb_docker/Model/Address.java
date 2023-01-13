package com.example.app.testmongodb_docker.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor

public class Address {
    private String country;
    private String postCode;
    private String city;

}
