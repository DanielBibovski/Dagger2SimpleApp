package com.example.dagger2app.dagger;

import com.example.dagger2app.car.Car;
import com.example.dagger2app.MainActivity;

import dagger.Component;

@Component (modules = {WeelsModule.class, DieselEngineModul.class})
public interface CarComponent {
    //The Injector
    Car getCar();

    void inject(MainActivity mainActivity);
}
