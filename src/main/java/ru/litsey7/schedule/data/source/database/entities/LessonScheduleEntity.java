package ru.litsey7.schedule.data.source.database.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.IOException;
import java.util.List;

@Entity
@Table(name = "lesson_schedule")
public class LessonScheduleEntity {
    @Id
    public Byte weekday;
    @JsonProperty("lessons")
    public String lessons;

    // Перевод списка уроков из JSON строки в структуру для ответа
    @JsonProperty("lessons")
    public List<LessonSchedule> getLessonsAsJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Преобразование строки "lessons" в список объектов LessonSchedule
            return objectMapper.readValue(lessons, new TypeReference<List<LessonSchedule>>() {});
        } catch (IOException e) {
            return null;
        }
    }

    // Сеттер для установки строки JSON
    @JsonProperty("lessons")
    public void setLessonsAsJson(List<LessonSchedule> lessonsAsJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Преобразование объекта в строку JSON
            this.lessons = objectMapper.writeValueAsString(lessonsAsJson);
        } catch (IOException e) {
            this.lessons = null;
        }
    }

    // Вложенные классы для структурирования данных внутри столбца "lessons"
    public static class LessonSchedule {
        @JsonProperty("class")
        public String className;
        public List<Lesson> lessons;
    }

    public static class Lesson {
        public String name;
        public String classroom;
    }
}
