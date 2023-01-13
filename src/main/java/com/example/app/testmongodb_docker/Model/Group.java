package com.example.app.testmongodb_docker.Model;


import com.example.app.testmongodb_docker.Model.enums.GroupE;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data

public class Group {

    @Id
    private long id;
    private GroupE group;
    private int     rok;

    public Group(GroupE group, int rok) {
        this.group = group;
        this.rok = rok;
    }
}
