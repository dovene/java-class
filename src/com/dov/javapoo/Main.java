package com.dov.javapoo;

public class Main {
    public static void main(String[] args) {
        Person david = new Person();
        david.setName("David");
        david.setAge(15);
       // System.out.println(david.getName() +" a "+david.getAge() + " ans");

        Student max = new Student();
        max.setName("Max");
        max.setAge(25);
        max.setCourseName("POO");
       // System.out.println(max.getName() +" a "+max.getAge() + " ans"+ "et est inscrit en "+max.getCourseName());

        david.whoAmI();
        max.whoAmI();
      }
}
