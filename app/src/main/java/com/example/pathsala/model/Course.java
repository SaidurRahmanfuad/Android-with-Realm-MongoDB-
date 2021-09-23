package com.example.pathsala.model;

import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Course extends RealmObject {
    @PrimaryKey
    int course_id;
    String course_name;
    String course_duration;
    String course_fee;
    List<ClassSchedule> classSchedules;


}
