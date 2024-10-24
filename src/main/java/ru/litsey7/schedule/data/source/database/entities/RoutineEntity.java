package ru.litsey7.schedule.data.source.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

// Модель одной строки в таблице с расписанием дня
@Entity
@Table(name = "daily_routine")
public class RoutineEntity {
    @Id
    public String name;
    public String start_time;
    public String end_time;
}
