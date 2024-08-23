package com.perscholas.timesheet.common;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "timesheet")
public record Timesheet(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id,
        String name,
        LocalDateTime punch_in_time,
        LocalDateTime punch_out_time,
        Integer hours_worked,
        @Enumerated(EnumType.STRING)
        Location location,
        Double pay_rate


) {
}
