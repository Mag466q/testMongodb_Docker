package com.example.app.testmongodb_docker.Model;


import com.example.app.testmongodb_docker.Model.enums.TypeE;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data

public class Group {

    @MongoId
    private String id;
    // WCY19KA1S0,WCY19KB1S0,WCY19KC1S1,WCY19KC1S0
    private String group;
    private int     rok;

    private TypeE type ;

    public Group(String group, int rok) {
        this.group = group;
        this.rok = rok;
    }
}
