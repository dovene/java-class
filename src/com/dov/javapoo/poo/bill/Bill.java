package com.dov.javapoo.poo.bill;

import java.util.ArrayList;

public class Bill {
    private ArrayList<BillItem> billItems;
    private String billId;

    public Bill(ArrayList<BillItem> billItems) {
        this.billItems = billItems;
    }

    public ArrayList<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(ArrayList<BillItem> billItems) {
        this.billItems = billItems;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double computeTotal(){
        double total = 0;
        for (BillItem billItem : getBillItems()) {
            total += (billItem.getUnitPrice() * billItem.getQuantity());
        }
        return total;
    }

    public double computeAmountToPay(){
       double priceToPay = computeTotal();
        if (priceToPay>1000){
            priceToPay = 0.9 * priceToPay ;
        }
        return priceToPay;
    }

    public BillItem getMostExpensiveBillItem(){
        BillItem mostExpensive = getBillItems().get(0);
        for (BillItem billItem : getBillItems()) {
            if ((billItem.getUnitPrice() * billItem.getQuantity()) > (mostExpensive.getQuantity() * mostExpensive.getUnitPrice())) {
                mostExpensive = billItem;
            }
        }
        return mostExpensive;
    }
}
