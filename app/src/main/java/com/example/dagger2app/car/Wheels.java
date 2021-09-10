package com.example.dagger2app.car;

import javax.inject.Inject;

public class Wheels {

    @Inject
    public Wheels() {
    }

    public Wheels(Rims rims, Tires tires) {
    }
}
