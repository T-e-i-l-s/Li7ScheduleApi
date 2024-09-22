package ru.litsey7.schedule.controllers;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// Эндпоинт для проверки активности api
@RestController
@RequestMapping("/api")
public class PingController {
    // GET запрос к /api/pong
    @ApiResponse(
            responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    examples = @ExampleObject(value = "{\"answer\": \"pong\"}")
            )
    )
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of("answer", "pong");
    }
}
