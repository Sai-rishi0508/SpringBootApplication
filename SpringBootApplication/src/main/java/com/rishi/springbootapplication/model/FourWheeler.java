package com.rishi.springbootapplication.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FourWheeler{
    @Value("2008")
    private int model;
    // @Autowired
    private Car car;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    @Qualifier("electric")
    public void setCar(Car car) {
        this.car = car;
    }

    public void vehicle(){
        System.out.println("Diesel Vehicle");
        car.roar();
    }
}
