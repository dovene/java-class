package com.dov.javapoo.poo.bill;

public class BillItem {
    private String nameArticle;
    private Double unitPrice;
    private Integer quantity;

    public BillItem(String nameArticle, Double unitPrice, Integer quantity) {
        this.nameArticle = nameArticle;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
