package com.example.app.testmongodb_docker.service;


import com.example.app.testmongodb_docker.repo.GroupRepository;
import com.example.app.testmongodb_docker.repo.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.PolyglotException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class ScriptService {

    private final StudentService studentService;
    private final GroupService groupService;
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;
    @Autowired
    public ScriptService(StudentService studentService, GroupService groupService, StudentRepository studentRepository, GroupRepository groupRepository) {
        this.studentService = studentService;
        this.groupService = groupService;
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
    }

    public String exec (String script){
        try(Context context = Context.newBuilder("js")
                .allowAllAccess(true)
                .build())
        {
            var bindings =context.getBindings("js");
            bindings.putMember("SS",studentService);
            bindings.putMember("GS",groupService);
            bindings.putMember("SR",studentRepository);
            bindings.putMember("GR",groupRepository);
            return context.eval("js",script).toString();



        }catch (PolyglotException e){
            log.error("Error executing",e);
            return e.getMessage()+ "\n" +e.getSourceLocation().toString();

        }

    }



}
