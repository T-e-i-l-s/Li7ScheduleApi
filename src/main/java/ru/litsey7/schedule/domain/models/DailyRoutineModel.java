package ru.litsey7.schedule.domain.models;

import java.sql.Time;

/*
 * Модель одного пункта в режиме дня.
 * Что содержит:
 * - Название пункта в режиме дня
 * - Начало
 * - Конец
 */
public class DailyRoutineModel {
    public String name;
    public Time start;
    public Time end;

    public DailyRoutineModel(String name, Time start, Time end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}
