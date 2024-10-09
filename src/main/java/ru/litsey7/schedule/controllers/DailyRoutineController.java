package ru.litsey7.schedule.controllers;

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

    // GET запрос к /api/schedule
    @GetMapping("/daily_routine")
    public List<RoutineEntity> getSchedule() {
        return dailyRoutineRepository.findAll();
    }
}
