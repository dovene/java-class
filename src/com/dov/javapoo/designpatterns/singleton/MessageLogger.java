package com.dov.javapoo.designpatterns.singleton;

import java.util.ArrayList;

public class MessageLogger {

    private static MessageLogger instance;  
    private ArrayList<String> logs = new ArrayList<>();

    private MessageLogger() { }

    public static MessageLogger getInstance() {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    public void addLog(String message) {
        logs.add(message);
    }

    public ArrayList<String> getLogs() {
        return logs;
    }
}

