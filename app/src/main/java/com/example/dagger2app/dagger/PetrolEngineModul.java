package com.example.dagger2app.dagger;

import com.example.dagger2app.car.Engine;
import com.example.dagger2app.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
abstract class PetrolEngineModul{

//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }

    @Binds
    abstract Engine bindsEngine(PetrolEngine engine);
}
