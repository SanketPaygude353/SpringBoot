package com.phoenix.autowire.constructor;

public class Car {

    private Specifications specifications;

    public Car(Specifications specifications) {
        this.specifications = specifications;
    }

    //    public void setSpecifications(Specifications specifications) {
//        System.out.println("Setter");
//        this.specifications = specifications;
//    }

    public void displayDetails() {

       System.out.println("Car Details"+specifications.toString());
   }

}
