package com.dov.javapoo.poo;

public class Student extends Person {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void whoAmI() {
        System.out.println(super.getName() + " a " + super.getAge() + " ans" + "et est inscrit en " + this.getCourseName());
    }
}
