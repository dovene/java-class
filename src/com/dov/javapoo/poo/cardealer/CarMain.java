package com.dov.javapoo.poo.cardealer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarMain {
    public static void main(String[] args) {
        ArrayList<Car> cars = fillCarList();
        displayCars(cars);
        displayCars1990An2000(cars);
        displayCarsPrice10000(cars);
        mostExpensiveCar(cars);
        leastExpensiveCar(cars);
        lessThanFiveYears(cars);
        displayToyota(cars);
        displayCarsPollutionlevel(cars);
        displayCarsPollutionCount(cars);
    }

    public static ArrayList<Car> fillCarList() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("AAA", "Peugeot", "208", 2000, 9000));
        cars.add(new Car("BBB", "Peugeot", "207", 1990, 9000));
        cars.add(new Car("CCC", "Toyota", "yaris", 2000, 5000));
        cars.add(new Car("DDD", "Toyota", "Avensis", 2010, 4000));
        cars.add(new Car("EEE", "Tesla", "ModelX", 2020, 45000));
        cars.add(new Car("FFF", "Tesla", "Model3", 2024, 30000));
        cars.add(new Car("GGG", "Renault", "Megane", 2000, 9000));
        cars.add(new Car("KKK", "Citroen", "C4", 2005, 9000));
        cars.add(new Car("LLL", "Citroen", "C3", 2000, 6000));
        cars.add(new Car("MMM", "Peugeot", "2008", 2000, 20000));
        return cars;
    }

    public static void displayCars(ArrayList<Car> cars) {
        System.out.println("--- toutes les voitures ---");
        cars.forEach(car -> System.out.println(car.getInformation()));
    }

    public static void displayCars1990An2000(ArrayList<Car> cars) {
        System.out.println("--- voitures en 1990 et 2000 ---");
        cars.stream().filter(car -> car.getYearOfSale() >= 1990 && car.getYearOfSale() <= 2000).forEach(car -> System.out.println(car.getInformation()));
    }

    public static void displayCarsPrice10000(ArrayList<Car> cars) {
        System.out.println("--- prix > 10000 ---");
        cars.stream().filter(car -> car.getPrice() > 10000).forEach(car -> System.out.println(car.getInformation()));
    }

    public static void mostExpensiveCar(ArrayList<Car> cars) {
        System.out.println("--- Plus chère ---");
        System.out.println(cars.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice()).collect(Collectors.toList()).get(0).getInformation());
    }

    public static void leastExpensiveCar(ArrayList<Car> cars) {
        System.out.println("--- Moins chère ---");
        System.out.println(cars.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).collect(Collectors.toList()).get(0).getInformation());
    }

    public static void lessThanFiveYears(ArrayList<Car> cars) {
        System.out.println("--- Moins de 5 ans ---");
        cars.stream().filter(car -> car.getCarAge() < 5).forEach(car -> System.out.println(car.getInformation()));
    }

    public static void displayToyota(ArrayList<Car> cars) {
        System.out.println("--- Toyota ---");
        List<Car> toyota = cars.stream().filter(car -> car.getBrand().equalsIgnoreCase("toyota")).collect(Collectors.toList());
        toyota.forEach(car -> System.out.println(car.getInformation()));
        System.out.println(String.format("On a %s voitures Toyota", toyota.size()));
    }

    public static void displayCarsPollutionlevel(ArrayList<Car> cars) {
        System.out.println("--- Pollution ---");
        cars.forEach(car -> System.out.println(car.getInformation() + " "+ car.getPollutionLevel()));
    }

    public static void displayCarsPollutionCount(ArrayList<Car> cars) {
        System.out.println("--- Pollution ---");
        List<String> pollutionLevels = Arrays.asList(Car.leastPolluting, Car.polluting, Car.mostPolluting);
        pollutionLevels.forEach(pollution -> System.out.println(pollution +" : "+cars.stream().filter(car -> car.getPollutionLevel().equalsIgnoreCase(pollution)).count()));
    }
}
