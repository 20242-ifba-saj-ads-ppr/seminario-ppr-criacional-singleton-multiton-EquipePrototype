package singletonMultiton;

import java.time.LocalTime;

public class Clock {
    
    private static Clock instance;
    private LocalTime time;

    private Clock() {
        this.time = LocalTime.now();
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void showTime() {
        System.out.println("Hora atual: " + this.time);
    }
}