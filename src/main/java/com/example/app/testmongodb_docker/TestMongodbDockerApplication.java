package com.example.app.testmongodb_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class TestMongodbDockerApplication {



    public static void main(String[] args) {
        SpringApplication.run(TestMongodbDockerApplication.class, args);

    }

//  @Bean
//  CommandLineRunner runner (GroupRepository repository){
//       return args -> {
//           Group group = new Group(
//                   GroupE.WCY19KB1S0,
//                    11
//           );
//           repository.insert(group);
//       };
//   }


// @Bean
// @Autowired
// CommandLineRunner runner (StudentRepository repository){
//
//     return args -> {
//         Address address = new Address(
//                 "Poland",
//                 "Warszaw",
//                 "00-00"
//         );
//         Student student = new Student(
//                 "Adrian",
//                 "Rokicki",
//                 "adrian.rokicki@wp.pl",
//                 GenderE.Female,
//                 address,
//                 groupService.findGroupByID(0L)
//
//
//         );
//         repository.insert(student);
//
//     };
// }

    }