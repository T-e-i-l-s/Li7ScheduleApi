package ru.litsey7.schedule.data.source.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;

@Entity
@Table(name = "daily_routine")
public class RoutineEntity {
    @Id
    public String name;

    @Column(name = "start_time")
    private Time start;

    @Column(name = "end_time")
    private Time end;
}
