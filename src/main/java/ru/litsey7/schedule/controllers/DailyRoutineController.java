package ru.litsey7.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.litsey7.schedule.data.repositories.DailyRoutineRepository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;
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
    @GetMapping("/daily_routine")
    public List<RoutineEntity> getSchedule() {
        return dailyRoutineRepository.findAll();
    }

    // POST запрос к /api/daily_routine
    @PostMapping("/daily_routine")
    public ResponseEntity<String> setDailyRoutine(@RequestBody List<RoutineEntity> routines) {
        dailyRoutineRepository.deleteAll();
        dailyRoutineRepository.saveAll(routines);
        return ResponseEntity.ok("Processed");
    }
}
