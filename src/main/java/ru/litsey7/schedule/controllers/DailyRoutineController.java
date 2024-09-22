package ru.litsey7.schedule.controllers;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.litsey7.schedule.data.repositories.DailyRoutineRepository;
import ru.litsey7.schedule.data.source.database.entities.RoutineEntity;

import java.util.List;

// Эндпоинт для работы с расписанием дня
@RestController
@RequestMapping("/api")
public class DailyRoutineController {
    // Репозиторий для работы с бд расписания дня
    @Autowired
    DailyRoutineRepository dailyRoutineRepository;

    // GET запрос к /api/daily_routine
    @ApiResponse(
            responseCode = "200",
            description = "Список событий с их временем",
            content = @Content(
                    mediaType = "application/json",
                    array = @ArraySchema(
                            schema = @Schema(implementation = RoutineEntity.class)
                    )
            )
    )
    @GetMapping("/daily_routine")
    public List<RoutineEntity> getDailyRoutine() {
        return dailyRoutineRepository.findAll();
    }
}
