package com.example.firstProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    //injecting repository
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        //lambda expression
        return args -> {
            Student sampu = new com.example.firstProject.student.Student
                    ( "sampu",
                            "sampu@gmail.com",
                            LocalDate.of(2000, Month.MAY, 1));

            Student kutu = new com.example.firstProject.student.Student
                    (
                            "kutu",
                            "kutu@gmail.com",
                            LocalDate.of(2002, Month.MAY, 1)
                            );

            repository.saveAll(List.of(sampu,kutu));


        };

    }
}
