package ru.litsey7.schedule.data.source.database.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.IOException;
import java.sql.Date;
import java.util.Map;

// Модель одной строки в таблице с расписанием дня
@Entity
@Table(name = "lesson_schedule")
public class LessonScheduleEntity {
    @Id
    public Date date;
    public String lessons;

    // Getter to convert the JSON string to a Map<String, Object>
    @JsonProperty("lessons")
    public Map<String, Object> getLessonsAsJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(lessons, new TypeReference<>() {});
        } catch (IOException e) {
            return null;
        }
    }

}
