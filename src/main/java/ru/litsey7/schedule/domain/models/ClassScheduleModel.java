package ru.litsey7.schedule.domain.models;

import java.util.List;

/*
 * Модель рассписания уроков для одного класса.
 * Что содержит:
 * - Название класса
 * - Список уроков
 */
public class ClassScheduleModel {
    public String name;
    public List<LessonModel> lessons;

    public ClassScheduleModel(String name, List<LessonModel> lessons) {
        this.name = name;
        this.lessons = lessons;
    }
}