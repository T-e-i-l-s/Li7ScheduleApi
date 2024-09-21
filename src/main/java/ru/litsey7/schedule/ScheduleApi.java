package ru.litsey7.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ScheduleApi {
    public static void main(String[] args) {

        System.out.println("start!!!!!!");
        SpringApplication.run(ScheduleApi.class, args);
    }
}