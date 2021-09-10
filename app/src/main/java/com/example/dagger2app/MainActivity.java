package com.example.dagger2app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2app.car.Car;
import com.example.dagger2app.dagger.CarComponent;
import com.example.dagger2app.dagger.DaggerCarComponent;
import com.example.dagger2app.dagger.DieselEngineModul;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // .create is available only if non of the modules takes arguments over the constructor
        //CarComponent component = DaggerCarComponent.create();


        //This is how we can inject values at runtime
        CarComponent component = DaggerCarComponent.builder().dieselEngineModul(new DieselEngineModul(100)).build();
        component.inject(this);

        //car = component.getCar();
        car.drive();

    }
}