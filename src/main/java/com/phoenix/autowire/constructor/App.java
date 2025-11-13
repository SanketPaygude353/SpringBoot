package com.phoenix.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoWireByConstructor.xml");
        Car car = context.getBean("myCar", Car.class);
        car.displayDetails();
    }

}
