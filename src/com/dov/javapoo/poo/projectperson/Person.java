package com.dov.javapoo.poo.projectperson;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String display() {
        return this.getName() + " a " + this.getAge() + " ans";
    }

    public String lifeStatus() {
        if (age <= 10) {
            return getName() + " est un enfant";
        } else if (age < 18) {
            return getName() + " est un ado";
        } else {
            return getName() + " est un adulte";
        }
    }
}
