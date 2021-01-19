package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student Florin = new Student(
                    "Florin",
                    "berceanuflorin@yahoo.com",
                    LocalDate.of(1994, Month.MAY, 11)
				);

            Student Razvan = new Student(
                    "Razvan",
                    "razvanpopescu@yahoo.com",
                    LocalDate.of(2000, Month.MAY, 18)
            );

            repository.saveAll(
                    List.of(Florin, Razvan)
            );
        };
    }
}
