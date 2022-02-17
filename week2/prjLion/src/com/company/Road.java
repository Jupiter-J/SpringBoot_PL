package com.company;

import java.util.ArrayList;

public class Road {

    private ArrayList<CarInterface> carsOnRoad;

    public Road() {
        this.carsOnRoad = new ArrayList<>();
    }

    public void addCar(CarInterface car) {
        this.carsOnRoad.add(car);
    }
}
