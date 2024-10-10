package ru.litsey7.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.litsey7.schedule.data.repositories.DailyRoutineRepository;
import ru.litsey7.schedule.data.repositories.NotificationsRepository;
import ru.litsey7.schedule.data.source.database.entities.NotificationEntity;
import ru.litsey7.schedule.data.source.database.entities.RoutineEntity;

import java.util.List;

// Эндпоинт для работы с расписанием дня
@RestController
@RequestMapping("/api")
public class NotificationsController {
    // Репозиторий для работы с бд расписания дня
    @Autowired
    NotificationsRepository notificationsRepository;

    // GET запрос к /api/schedule
    @GetMapping("/notifications")
    public List<NotificationEntity> getNotifications() {
        return notificationsRepository.findAll();
    }
}
