package com.phoenix.example;

public class Car {

    private Specifications specifications;

    public Car(Specifications specifications) {
        this.specifications = specifications;
    }

    public void displayDetails() {

       System.out.println("Car Details"+specifications.toString());
   }

}
