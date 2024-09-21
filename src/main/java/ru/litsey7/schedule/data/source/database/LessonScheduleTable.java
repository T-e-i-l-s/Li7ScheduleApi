package ru.litsey7.schedule.data.source.database;

import ru.litsey7.schedule.domain.models.ClassScheduleModel;

import java.time.LocalDate;
import java.util.List;

// Класс для работы с таблицой расписания в бд.
public class LessonScheduleTable {
    // Функция получения списка уроков на конкретную дату
    public List<ClassScheduleModel> getScheduleByDate(LocalDate date) {
        return List.of(); // TODO: Заменить заглушку
    }
}
