package com.phoenix.autowire.type;

public class Car {

    private Specifications specifications;

    public void setSpecifications(Specifications specifications) {
//        System.out.println("Setter");
        this.specifications = specifications;
    }

    public void displayDetails() {

       System.out.println("Car Details"+specifications.toString());
   }

}
