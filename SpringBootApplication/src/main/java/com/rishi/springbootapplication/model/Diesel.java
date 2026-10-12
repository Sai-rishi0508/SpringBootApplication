package com.rishi.springbootapplication.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Diesel implements Car{

    public void roar() {
        System.out.println("Diesel Vehicle");
    }
}

