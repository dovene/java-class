package com.dov.javapoo.designpatterns.facade;

public class LibraryFacade {
    private BookSystem bookSystem;
    private LoanSystem loanSystem;

    public LibraryFacade() {
        bookSystem = BookSystem.getInstance();
        loanSystem = LoanSystem.getInstance();
    }

    public void addBook(String title, String author) {
        bookSystem.addBook(title, author);
    }

    public Book findBook(String title, String author) {
        return bookSystem.searchBook(title, author);
    }

    public void loanBook(String title, String author, String borrowerName, String borrowerFirstName) {
        Book book = findBook(title, author); 
        loanSystem.registerLoan(book, borrowerName, borrowerFirstName);
    }
   
    public void returnBook(String title, String author, String borrowerName, String borrowerFirstName) {
        Book book = findBook(title, author); 
        loanSystem.registerReturn(book, borrowerName, borrowerFirstName);
    }

    public void displayLoans() {
        loanSystem.displayLoans();
    }
    public void displayBooks() {
        System.out.println("Liste des livres ");
        bookSystem.getBooks().forEach(book -> System.out.println(book.getInformation()));
    }
}
