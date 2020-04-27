package com.example.daggerex7;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void enableRemote(Remote remote){

    }

    void drive(){
        engine.start();
        Log.d(TAG, "Driving ... !!");
    }


}
