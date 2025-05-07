package com.dov.javapoo.library;

import java.util.Date;

class Magazine extends Document {
    private String issueNumber;
    private String periodicity;

    public Magazine(String title, String author, Date publicationDate,
            String issueNumber, String periodicity) {
        super(title, author, publicationDate);
        this.issueNumber = issueNumber;
        this.periodicity = periodicity;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    @Override
    public String getInformation() {
        return "Magazine: " + title +
                " * Auteur: " + author +
                " * Date de publication: " + sdf.format(publicationDate) +
                " * Numéro de parution: " + issueNumber +
                " * Périodicité: " + periodicity;
    }
}
