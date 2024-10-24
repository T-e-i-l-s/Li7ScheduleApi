package ru.litsey7.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.litsey7.schedule.data.repositories.DailyRoutineRepository;
import ru.litsey7.schedule.data.repositories.NotificationsRepository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;
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

    // GET запрос к /api/notifications
    @GetMapping("/notifications")
    public List<NotificationEntity> getNotifications() {
        return notificationsRepository.findAll();
    }

    // Post запрос к /api/notifications
    @PostMapping("/notifications")
    public ResponseEntity<String> addNotification(@RequestBody NotificationEntity notification) {
        notificationsRepository.save(notification);
        return ResponseEntity.ok("Processed");
    }

    // Post запрос к /api/notifications
    @DeleteMapping("/notifications")
    public ResponseEntity<String> deleteNotification(@RequestParam String id) {
        notificationsRepository.deleteById(id);
        return ResponseEntity.ok("Processed");
    }
}
