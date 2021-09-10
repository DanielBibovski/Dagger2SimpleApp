package com.example.dagger2app.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("CAR", "Diesel engine started. Horse power: " + horsePower);
    }
}
