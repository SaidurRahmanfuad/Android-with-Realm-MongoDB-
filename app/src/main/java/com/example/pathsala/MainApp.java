package com.example.pathsala;

import android.app.Application;

import io.realm.Realm;

public class MainApp extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
