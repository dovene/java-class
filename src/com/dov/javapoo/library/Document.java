package com.dov.javapoo.library;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Document implements Information {
    protected String title;
    protected String author;
    protected Date publicationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Document(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

}