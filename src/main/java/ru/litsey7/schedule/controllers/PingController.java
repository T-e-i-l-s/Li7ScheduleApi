package ru.litsey7.schedule.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// Эндпоинт для проверки активности api
@RestController
@RequestMapping("/api")
public class PingController {
    // GET запрос к /api/pong
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("answer", "pong");
    }
}
