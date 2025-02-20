package com.dov.javapoo.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Library {
    private ArrayList<Document> documents;
    private Scanner scanner;
    private SimpleDateFormat sdf;

    public Library() {
        documents = new ArrayList<>();
        scanner = new Scanner(System.in);
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void addDocument() {
        try {
            System.out.println("Saisir le type du document (1 = Livre, 2 = Magazine):");
            int type = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Saisir le titre:");
            String title = scanner.nextLine();

            System.out.println("Saisir l'auteur:");
            String author = scanner.nextLine();

            System.out.println("Saisir la date de publication (dd/MM/yyyy):");
            Date publicationDate = sdf.parse(scanner.nextLine());

            if (type == 1) {
                System.out.println("Saisir l'ISBN:");
                String isbn = scanner.nextLine();
                documents.add(new Book(title, author, publicationDate, isbn));
            } else if (type == 2) {
                System.out.println("Saisir le numéro parution:");
                String issueNumber = scanner.nextLine();

                System.out.println("Saisir la périodicité (quotidien/hebdo/mensuel):");
                String periodicity = scanner.nextLine();

                documents.add(new Magazine(title, author, publicationDate,
                        issueNumber, periodicity));
            }
            System.out.println("Document ajouté avec succès!");
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Utilisez dd/MM/yyyy");
        }
    }

    public void modifyDocument() {
        System.out.println("Saisir l'ISBN ou le numéro de parution du document à modifier:");
        String identifier = scanner.nextLine();

        Document doc = findDocumentByIdentifier(identifier);
        if (doc != null) {
            System.out.println("Informations actuelles:\n" + doc.getInformation());
            try {
                System.out.println("\nSaisir le nouveau titre:");
                String input = scanner.nextLine();
                doc.title = input;

                System.out.println("Saisir le nouvel auteur:");
                input = scanner.nextLine();
                doc.author = input;

                System.out.println("Saisir la nouvelle date de publication:");
                input = scanner.nextLine();
                doc.publicationDate = sdf.parse(input);

                if (doc instanceof Magazine) {
                    Magazine mag = (Magazine) doc;
                    System.out.println("Saisir la nouvelle périodicité:");
                    input = scanner.nextLine();
                    mag.setPeriodicity(input);
                }

                System.out.println("Document modifié avec succès!");
            } catch (ParseException e) {
                System.out.println("Date invalide, modification annulée.");
            }
        } else {
            System.out.println("Document introuvable!");
        }
    }

    public void deleteDocument() {
        System.out.println("Saisir l'ISBN ou le numéro de parution du document à supprimer:");
        String identifier = scanner.nextLine();

        Document doc = findDocumentByIdentifier(identifier);
        if (doc != null) {
            documents.remove(doc);
            System.out.println("Document supprimé avec succès!");
        } else {
            System.out.println("Document introuvable!");
        }
    }

    private Document findDocumentByIdentifier(String identifier) {
        for (Document doc : documents) {
            if (doc instanceof Book) {
                if (((Book) doc).getIsbn().equals(identifier)) {
                    return doc;
                }
            } else if (doc instanceof Magazine) {
                if (((Magazine) doc).getIssueNumber().equals(identifier)) {
                    return doc;
                }
            }
        }
        return null;
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("library.txt"))) {
            for (Document doc : documents) {
                if (doc instanceof Book) {
                    writer.write("Livre," + doc.getTitle() + "," + doc.getAuthor() + ","
                            + sdf.format(doc.publicationDate) + "," + ((Book) doc).getIsbn());
                } else if (doc instanceof Magazine) {
                    writer.write("Magazine," + doc.getTitle() + "," + doc.getAuthor() + ","
                            + sdf.format(doc.publicationDate) + "," + ((Magazine) doc).getIssueNumber() + ","
                            + ((Magazine) doc).getPeriodicity());
                }
                writer.newLine();

            }
            System.out.println("Enregistrement dans le fichier effectué avec succès!");
        } catch (IOException e) {
            System.out.println("Erreur fichier" + e.getMessage());
        }
    }

    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("library.txt"))) {
            documents = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String title = parts[1];
                String author = parts[2];
                Date publicationDate = sdf.parse(parts[3]);

                if (type.equals("Livre")) {
                    String isbn = parts[4];
                    documents.add(new Book(title, author, publicationDate, isbn));
                } else if (type.equals("Magazine")) {
                    String issueNumber = parts[4];
                    String periodicity = parts[5];
                    documents.add(new Magazine(title, author, publicationDate, issueNumber, periodicity));
                }
            }
            System.out.println("Chargement des documents effectué avec succès!");
        } catch (IOException | ParseException e) {
            System.out.println("Erreur de chargement depuis le fichier: " + e.getMessage());
        }
    }

    public void displayDocuments() {
        if (documents.isEmpty()) {
            System.out.println("Aucun document disponible!");
            return;
        }

        System.out.println("\nListe de documents:");
        for (Document doc : documents) {
            System.out.println(doc.getInformation());
        }
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n=== Gestionnaire de bibliothèque ===");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Modifier un document");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Enregistrer les documents dans un fichier");
            System.out.println("5. Charger les documents depuis un fichier");
            System.out.println("6. Afficher les documents");
            System.out.println("7. Quitter");
            System.out.print("Saisir votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDocument();
                    break;
                case 2:
                    modifyDocument();
                    break;
                case 3:
                    deleteDocument();
                    break;
                case 4:
                    saveToFile();
                    break;
                case 5:
                    loadFromFile();
                    break;
                case 6:
                    displayDocuments();
                    break;
                case 7:
                    System.out.println("Aurevoir!");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide reéssayer svp.");
            }
        }
    }
}
