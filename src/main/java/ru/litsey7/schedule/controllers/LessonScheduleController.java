package ru.litsey7.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.litsey7.schedule.data.repositories.LessonScheduleRepository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;

import java.time.LocalDate;
import java.util.List;

// Эндпоинт для работы с расписанием дня
@RestController
@RequestMapping("/api")
public class LessonScheduleController {
    // Репозиторий для работы с бд расписания уроков
    @Autowired
    LessonScheduleRepository lessonScheduleRepository;

    // GET запрос к /api/lesson_schedule
    @GetMapping("/full_lesson_schedule")
    public List<LessonScheduleEntity> getSchedule() {
        List<LessonScheduleEntity> lessons = lessonScheduleRepository.findAll();

        return lessons.stream()
                .peek(LessonScheduleEntity::getLessonsAsJson) // Переводим строку lessons в json(см LessonScheduleEntity)
                .toList();
    }

    // GET запрос к /api/lesson_schedule
    @GetMapping("/lesson_schedule")
    public LessonScheduleEntity getScheduleByDate(
        @RequestParam("date")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        List<LessonScheduleEntity> lessons = lessonScheduleRepository.findByDate(date);
        return lessons.stream()
                .peek(LessonScheduleEntity::getLessonsAsJson)
                .toList()
                .get(0);
    }
}
