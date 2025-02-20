package library;

import java.util.Date;

class Book extends Document {
    private String isbn;

    public Book(String title, String author, Date publicationDate, String isbn) {
        super(title, author, publicationDate);
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getInformation() {
        return "Livre: " + title +
                " * Auteur: " + author +
                " * Date de publication: " + sdf.format(publicationDate) +
                " * ISBN: " + isbn;
    }
}
