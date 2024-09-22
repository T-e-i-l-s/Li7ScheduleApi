package ru.litsey7.schedule.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.litsey7.schedule.data.source.database.entities.RoutineEntity;

// Класс для работы с таблицой режима дня в бд.
@Repository
public interface DailyRoutineRepository extends JpaRepository<RoutineEntity, String> {}
