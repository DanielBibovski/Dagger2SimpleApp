package com.example.dagger2app.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    @Inject
    public PetrolEngine(){}

    @Override
    public void start() {
        Log.d("CAR", "Petrol engine starting...");
    }
}
