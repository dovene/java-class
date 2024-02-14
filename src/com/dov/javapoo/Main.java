package com.dov.javapoo;

import com.dov.javapoo.poo.Car;
import com.dov.javapoo.poo.ElectricCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Person david = new Person();
        david.setName("David");
        david.setAge(15);
       // System.out.println(david.getName() +" a "+david.getAge() + " ans");

        Student max = new Student();
        max.setName("Max");
        max.setAge(25);
        max.setCourseName("POO");
       // System.out.println(max.getName() +" a "+max.getAge() + " ans"+ "et est inscrit en "+max.getCourseName());

        david.whoAmI();
        max.whoAmI();*/

        Car peuget208 = new Car("Peugeot", "208");
        ElectricCar teslaModel3 = new ElectricCar("Tesla", "model 3", 2000);
        Car peuget207 = new Car("Peugeot", "207");
        ElectricCar teslaModelX = new ElectricCar("Tesla", "model X", 2000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(peuget208);
        cars.add(peuget207);
        cars.add(teslaModel3);
        cars.add(teslaModelX);

        for(Car car: cars) {
            car.start();
            car.stop();
        }

        for(Car car: cars) {
            if (car instanceof ElectricCar) {
                car.display();
            }
        }

        cars.forEach(car -> {
            if (car instanceof ElectricCar) {
                car.display();
            }
        });



      }
}
