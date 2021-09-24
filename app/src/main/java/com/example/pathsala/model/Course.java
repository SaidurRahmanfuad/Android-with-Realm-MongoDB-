package com.example.pathsala.model;

import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Course extends RealmObject {
    @PrimaryKey()
   private int course_id;
    String course_name;
    String course_duration;
    String course_fee;
    String total_class;
    ClassSchedule classSchedules;

    public String getTotal_class() {
        return total_class;
    }

    public void setTotal_class(String total_class) {
        this.total_class = total_class;
    }

    public Course() {
    }

    public Course(int course_id, String course_name, String course_duration, String course_fee, ClassSchedule classSchedules,String total_class) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_duration = course_duration;
        this.course_fee = course_fee;
        this.classSchedules = classSchedules;
        this.total_class = total_class;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }

    public ClassSchedule getClassSchedules() {
        return classSchedules;
    }

    public void setClassSchedules(ClassSchedule classSchedules) {
        this.classSchedules = classSchedules;
    }
}
