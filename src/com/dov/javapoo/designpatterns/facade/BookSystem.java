package com.dov.javapoo.designpatterns.facade;

import java.util.ArrayList;

public class BookSystem {
    private static BookSystem instance;
    private ArrayList<Book> books = new ArrayList<>();

    private BookSystem() { }

    public static BookSystem getInstance() {
        if (instance == null) {
            instance = new BookSystem();
        }
        return instance;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Livre ajouté : \"" + title + "\" by " + author);
    }

    public Book searchBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Livre trouvé : " + book.getInformation());
                return book;
            }
        }
        System.out.println("Livre non trouvé : \"" + title + "\" by " + author);
        return null;
    }

    
}
