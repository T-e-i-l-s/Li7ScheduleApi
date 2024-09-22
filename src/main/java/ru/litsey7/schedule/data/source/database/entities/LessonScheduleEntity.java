package ru.litsey7.schedule.data.source.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.json.JSONArray;

import java.sql.Date;
import java.util.List;

// Модель одной строки в таблице с расписанием дня
@Entity
@Table(name = "lesson_schedule")
public class LessonScheduleEntity {
    @Id
    public Date date;
    public String lessons;
}
