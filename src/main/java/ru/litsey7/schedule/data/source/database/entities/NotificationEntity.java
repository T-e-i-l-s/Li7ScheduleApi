package ru.litsey7.schedule.data.source.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

// Модель одной строки в таблице с расписанием дня
@Entity
@Table(name = "notifications")
public class NotificationEntity {
    @Id
    public String title;
    public String description;
}
