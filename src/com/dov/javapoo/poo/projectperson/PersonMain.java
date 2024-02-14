package com.dov.javapoo.poo.projectperson;


import java.util.*;
import java.util.function.Consumer;

public class PersonMain {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Nico", 9));
        persons.add(new Person("Lyne", 23));
        persons.add(new Person("Noa", 75));

        displayPersons(persons);
        displayLifeStatus(persons);

        persons.clear();

        for (int i = 0; i <= 19; i++) {
            persons.add(new Person("Name " + i, new Random().nextInt(90)));
        }
        displayPersons(persons);

        System.out.println("la personne la plus âgée" + oldestPerson(persons));

        System.out.println(ageCount(persons));
    }

    public static void displayPersons(ArrayList<Person> people) {
        people.forEach(person -> {
            System.out.println(person.display());
        });
    }

    public static void displayLifeStatus(ArrayList<Person> people) {
        people.forEach(person -> {
            System.out.println(person.lifeStatus());
        });
    }

    public static String oldestPerson(ArrayList<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).get().display();
    }

    public static String ageCount(ArrayList<Person> people) {
        StringBuilder result = new StringBuilder();

        HashMap<Integer, Integer> stats = new HashMap<>();
        people.forEach(person -> {
            if (stats.containsKey(person.getAge())) {
                int age = stats.get(person.getAge());
                stats.put(person.getAge(), age + 1);
            } else {
                stats.put(person.getAge(), 1);
            }
        });

        for (Map.Entry<Integer, Integer> entry : stats.entrySet()) {
            result.append("Il y a ").append(entry.getValue()).append(" personnes de ").append(entry.getKey()).append(" ans \n");
        }
        return result.toString();
    }
}
