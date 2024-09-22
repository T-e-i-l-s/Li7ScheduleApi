package ru.litsey7.schedule.controllers;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.litsey7.schedule.data.repositories.DailyRoutineRepository;
import ru.litsey7.schedule.data.repositories.LessonScheduleRepository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;
import ru.litsey7.schedule.data.source.database.entities.RoutineEntity;

import java.util.List;
import java.util.stream.Collectors;

// Эндпоинт для работы с расписанием дня
@RestController
@RequestMapping("/api")
public class ScheduleController {
    // Репозиторий для работы с бд расписания дня
    @Autowired
    DailyRoutineRepository dailyRoutineRepository;
    // Репозиторий для работы с бд расписания уроков
    @Autowired
    LessonScheduleRepository lessonScheduleRepository;

    // GET запрос к /api/schedule
    @GetMapping("/schedule")
    public void getSchedule() {
        List<RoutineEntity> routines = dailyRoutineRepository.findAll();
        List<LessonScheduleEntity> lessons = lessonScheduleRepository.findAll();
    }
}
