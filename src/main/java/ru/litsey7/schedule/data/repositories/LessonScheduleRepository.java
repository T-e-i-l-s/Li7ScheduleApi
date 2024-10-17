package ru.litsey7.schedule.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.litsey7.schedule.data.source.database.entities.LessonScheduleEntity;

import java.time.LocalDate;
import java.util.List;

// Класс для работы с таблицой режима дня в бд.
@Repository
public interface LessonScheduleRepository extends JpaRepository<LessonScheduleEntity, String> {
    List<LessonScheduleEntity> findByWeekday(Byte weekday);
}
