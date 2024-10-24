package ru.litsey7.schedule.data.source.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

// Модель одной строки в таблице с расписанием дня
@Entity
@Table(name = "notifications")
public class NotificationEntity {
    @Id
    @GeneratedValue
    public Integer id;
    public String title;
    public String description;
}
