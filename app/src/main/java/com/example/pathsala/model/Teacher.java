package com.example.pathsala.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Teacher extends RealmObject {
    @PrimaryKey
    int t_id;
    String t_name;
    String t_address;
    String t_phone;
    String t_subexperience;
    String t_eduqualification;
    String t_currentjob;
    String t_jobexperience;

    public Teacher(int t_id, String t_name, String t_address, String t_phone, String t_subexperience, String t_eduqualification, String t_currentjob, String t_jobexperience) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_address = t_address;
        this.t_phone = t_phone;
        this.t_subexperience = t_subexperience;
        this.t_eduqualification = t_eduqualification;
        this.t_currentjob = t_currentjob;
        this.t_jobexperience = t_jobexperience;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

    public String getT_subexperience() {
        return t_subexperience;
    }

    public void setT_subexperience(String t_subexperience) {
        this.t_subexperience = t_subexperience;
    }

    public String getT_eduqualification() {
        return t_eduqualification;
    }

    public void setT_eduqualification(String t_eduqualification) {
        this.t_eduqualification = t_eduqualification;
    }

    public String getT_currentjob() {
        return t_currentjob;
    }

    public void setT_currentjob(String t_currentjob) {
        this.t_currentjob = t_currentjob;
    }

    public String getT_jobexperience() {
        return t_jobexperience;
    }

    public void setT_jobexperience(String t_jobexperience) {
        this.t_jobexperience = t_jobexperience;
    }
}
