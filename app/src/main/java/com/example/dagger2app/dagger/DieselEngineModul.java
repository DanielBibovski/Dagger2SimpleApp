package com.example.dagger2app.dagger;

import com.example.dagger2app.car.DieselEngine;
import com.example.dagger2app.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModul {
    private int horsePower;

    public DieselEngineModul(int horsePower) {
        this.horsePower = horsePower;
    }

//    @Provides
//    int providesHorsePower(){
//        return horsePower;
//    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }

//    Use this with abstract class
//    @Binds
//    abstract Engine bindsEngine(DieselEngine engine);

}
