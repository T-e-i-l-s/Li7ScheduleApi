package ru.litsey7.schedule.domain.models;

/*
 * Модель одного урока.
 * Что содержит:
 * - Название урока
 * - Кабинет
 */
public class LessonModel {
    public String name;
    public String classroom;

    public LessonModel(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }
}
