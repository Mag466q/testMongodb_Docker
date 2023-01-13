package com.example.app.testmongodb_docker.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScriptServiceTest {

@Autowired ScriptService scriptService;


@Test
    public void testCase(){
        String script= """
                  SR.f
                """;


        assert   scriptService.exec(script).equals("3");
}


//@Test
//    public void testCase(){
//        String script= """
//                    var x = 1;
//                    var y = 2;
//                    x+y ;
//
//                """;
//
//
//        assert   scriptService.exec(script).equals("3");


}