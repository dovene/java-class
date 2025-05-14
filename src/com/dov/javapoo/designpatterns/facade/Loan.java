package com.dov.javapoo.designpatterns.facade;

public class Loan {
    private Book book;
    private String lastName;
    private String firstName;

    public Loan(Book book, String lastName, String firstName) {
        this.book = book;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Book getBook() {
        return book;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

}
