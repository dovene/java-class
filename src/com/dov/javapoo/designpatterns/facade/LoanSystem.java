package com.dov.javapoo.designpatterns.facade;


import java.util.ArrayList;
import java.util.List;

public class LoanSystem {
    private static LoanSystem instance;
    private List<Loan> loans = new ArrayList<>();

    private LoanSystem() { }

    public static LoanSystem getInstance() {
        if (instance == null) {
            instance = new LoanSystem();
        }
        return instance;
    }


    public void registerLoan(Book book, String borrowerName, String borrowerFirstName) {
        if (book != null) { 
            Loan loan = new Loan(book, borrowerName, borrowerFirstName);
            loans.add(loan);
        } else {
            System.out.println("Livre non trouvé, prêt non enregistré.");
        }
    }

    public void registerReturn(Book book, String borrowerName, String borrowerFirstName) {
        if (book != null) {
            Loan loanToRemove = null;
            for (Loan loan : loans) {
                if (loan.getBook().equals(book) && loan.getLastName().equals(borrowerName) && loan.getFirstName().equals(borrowerFirstName)) {
                    loanToRemove = loan;
                    break; 
                }
            }
            if (loanToRemove != null) {
                loans.remove(loanToRemove);
                System.out.println("Retour bien effectué: " + loanToRemove.getFirstName() + " " + loanToRemove.getLastName() + " a retourné \"" + loanToRemove.getBook().getTitle() + "\" de " + loanToRemove.getBook().getAuthor());   
            } else {
                System.out.println("Erreur : prêt non trouvé pour le livre \"" + book.getTitle() + "\" by " + book.getAuthor());
            }
        } else {
            System.out.println("Livre non trouvé, retour non enregistré.");
        }
    }

    public void displayLoans() {
        if (loans.isEmpty()) {
            System.out.println("Aucun prêt.");
        } else {
            System.out.println("Liste des prêts:");
            for (Loan loan : loans) {
                System.out.println(loan.getFirstName() + " " + loan.getLastName() + " a emprunté \"" + loan.getBook().getTitle() + "\" de " + loan.getBook().getAuthor());
                            }
        }
    }
    
}
