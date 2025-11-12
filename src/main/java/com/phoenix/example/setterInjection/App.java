package com.phoenix.example.setterInjection;

import com.phoenix.example.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        com.phoenix.example.Car car = context.getBean("myCar", Car.class);
        car.displayDetails();
    }

}
