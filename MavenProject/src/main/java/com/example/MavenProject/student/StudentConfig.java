package com.example.MavenProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student basilis = new Student(
                    "Basilis",
                    "Basilis@gmail.com",
                    LocalDate.of(2001, Month.MARCH,5),
                    23
            );
            Student xrhstos = new Student(
                    "Xrhstos",
                    "xrhstos@gmail.com",
                    LocalDate.of(2002, Month.DECEMBER,15),
                    21
            );

            repository.saveAll(
                    List.of(basilis,xrhstos)
            );
        };
    }
}
