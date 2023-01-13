package com.example.app.testmongodb_docker.controller;


import com.example.app.testmongodb_docker.service.ScriptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/script")

public class ScriptController {

    private final ScriptService scriptService;

    public ScriptController(ScriptService scriptService) {
        this.scriptService = scriptService;
    }

    @PutMapping("/defult")
    public ResponseEntity<String> execScript(@RequestBody String script){
        return new ResponseEntity<>(scriptService.exec(script), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<String> execScript(){
        String script = """
                                
                const tab = [];
                function A() {
                    var q = 0;
                    for (studnet of SR.findAll()) {
                        x = studnet.getGroupId();
                        w = x.getGroup();
                        c = 'WCY19KB1S0';
 
                        if (w == c) {
                            tab.push(studnet.getFirstName())
                            q = q+1;
                            console.log(q);
                            return q;
                        }
                    }
                }
                A();
                tab;
                """;

        return new ResponseEntity<>(scriptService.exec(script), HttpStatus.OK);
    }

}



