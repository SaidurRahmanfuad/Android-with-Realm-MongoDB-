package com.example.pathsala.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ClassSchedule extends RealmObject {
    @PrimaryKey
    int schedule_id;

    String schedule_day;
    String schedule_time;
    String schedule_date;

    public ClassSchedule(int schedule_id, String schedule_day, String schedule_time, String schedule_date) {
        this.schedule_id = schedule_id;
        this.schedule_day = schedule_day;
        this.schedule_time = schedule_time;
        this.schedule_date = schedule_date;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getSchedule_day() {
        return schedule_day;
    }

    public void setSchedule_day(String schedule_day) {
        this.schedule_day = schedule_day;
    }

    public String getSchedule_time() {
        return schedule_time;
    }

    public void setSchedule_time(String schedule_time) {
        this.schedule_time = schedule_time;
    }

    public String getSchedule_date() {
        return schedule_date;
    }

    public void setSchedule_date(String schedule_date) {
        this.schedule_date = schedule_date;
    }
}
