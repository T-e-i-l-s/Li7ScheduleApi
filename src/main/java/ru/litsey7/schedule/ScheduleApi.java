package ru.litsey7.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScheduleApi {
    public static void main(String[] args) {
        System.out.println("Start!!!!!!");
        SpringApplication.run(ScheduleApi.class, args);
    }
}