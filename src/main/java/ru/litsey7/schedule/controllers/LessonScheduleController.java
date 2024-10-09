package ru.litsey7.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.litsey7.schedule.data.repositories.LessonScheduleRepository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;

import java.util.List;

// Эндпоинт для работы с расписанием дня
@RestController
@RequestMapping("/api")
public class LessonScheduleController {
    // Репозиторий для работы с бд расписания уроков
    @Autowired
    LessonScheduleRepository lessonScheduleRepository;

    // GET запрос к /api/schedule
    @GetMapping("/lesson_schedule")
    public List<LessonScheduleEntity> getSchedule() {
        List<LessonScheduleEntity> lessons = lessonScheduleRepository.findAll();

        return lessons.stream()
                .peek(LessonScheduleEntity::getLessonsAsJson) // Переводим строку lessons в json(см LessonScheduleEntity)
                .toList();
    }
}
