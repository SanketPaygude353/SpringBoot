package com.phoenix.example.setterInjection;

import com.phoenix.example.Specifications;

public class Car {

    private Specifications specifications;

    public Car() {
    }

    public Car(Specifications specifications) {
        this.specifications = specifications;
    }

    public void displayDetails() {

        System.out.println("Car Details"+specifications.toString());
    }

}
