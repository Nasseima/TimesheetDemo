package com.perscholas.timesheet.common;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "timesheet")
public class Timesheet {
        @Id
        private Integer id;
        private String name;
        private LocalDateTime punch_in_time;
        private LocalDateTime punch_out_time;
        private Integer hours_worked;
        @Enumerated(EnumType.STRING)
        private Location location;
        private Double pay_rate;

        //Default Constructor
        public Timesheet() {
        }

        public Timesheet(Integer id, String name, LocalDateTime punch_in_time, LocalDateTime punch_out_time, Integer hours_worked, Location location, Double pay_rate) {
                this.id = id;
                this.name = name;
                this.punch_in_time = punch_in_time;
                this.punch_out_time = punch_out_time;
                this.hours_worked = hours_worked;
                this.location = location;
                this.pay_rate = pay_rate;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDateTime getPunch_in_time() {
                return punch_in_time;
        }

        public void setPunch_in_time(LocalDateTime punch_in_time) {
                this.punch_in_time = punch_in_time;
        }

        public LocalDateTime getPunch_out_time() {
                return punch_out_time;
        }

        public void setPunch_out_time(LocalDateTime punch_out_time) {
                this.punch_out_time = punch_out_time;
        }

        public Integer getHours_worked() {
                return hours_worked;
        }

        public void setHours_worked(Integer hours_worked) {
                this.hours_worked = hours_worked;
        }

        public Location getLocation() {
                return location;
        }

        public void setLocation(Location location) {
                this.location = location;
        }

        public Double getPay_rate() {
                return pay_rate;
        }

        public void setPay_rate(Double pay_rate) {
                this.pay_rate = pay_rate;
        }
}