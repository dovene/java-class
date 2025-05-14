package com.dov.javapoo.designpatterns.facade;

public class LibraryMain {
   
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        
        library.displayBooks();
        
        library.loanBook("The Great Gatsby", "F. Scott Fitzgerald", "John", "Doe");
        library.displayLoans();
        
        library.returnBook("The Great Gatsby", "F. Scott Fitzgerald", "John", "Doe");
        library.displayLoans();
    }
}
