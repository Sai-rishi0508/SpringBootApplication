package com.rishi.springbootapplication.model;

import org.springframework.stereotype.Component;

@Component
public class Electric implements Car{

    public void roar() {
        System.out.println("Electric Vehicle");
    }
}
