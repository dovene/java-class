package com.dov.javapoo.poo.bill;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BillMain {

    public static void main(String[] args) {
        BillItem pain = new BillItem("pain", 5.0, 21);
        BillItem jus = new BillItem("jus", 30.0, 5);
        BillItem saucisse = new BillItem("saucisse", 150.0, 200);
        BillItem sauce = new BillItem("sauce", 3.0, 15);

        ArrayList<BillItem> billItems = new ArrayList<>();
        billItems.add(pain);
        billItems.add(jus);
        billItems.add(saucisse);
        billItems.add(sauce);

        Bill bill = new Bill(billItems);

        //Total
        System.out.println("--- Total ----");
        System.out.println("le total de la facture est :" + bill.computeTotal());

        //Article le plus cher
        System.out.println("--- Article le plus cher ----");
        System.out.println("l'article recherché est : " + bill.getMostExpensiveBillItem().getNameArticle());

        //Total à payer
        System.out.println("--- Total à payer après réduction ----");
        System.out.println("le prix à payer est : " + bill.computeAmountToPay());


        //Onéreuse
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            ArrayList<BillItem> billItemsForBillList = new ArrayList<>();
            billItemsForBillList.add(new BillItem("pain", 5.0, 21 * i));
            billItemsForBillList.add(new BillItem("jus", 30.0, 5 * i));
            billItemsForBillList.add(new BillItem("saucisse", 150.0, 200 * i));
            billItemsForBillList.add(new BillItem("sauce", 3.0, 15 * i));
            Bill billForList = new Bill(billItemsForBillList);
            billForList.setBillId("" + i);
            bills.add(billForList);
        }



        System.out.println("--- Facture la plus chère ----");


        // donne le numéro de la facture recherchée est sans utiliser 
        Bill bill1 = bills.get(0);  
        for (Bill bill2 : bills) {
            if (bill2.computeAmountToPay() > bill1.computeAmountToPay()) {
                bill1 = bill2;
            }
        }   
        System.out.println("le numéro de la facture recherchée est : " + bill1.getBillId());
         //stream sorted
         System.out.println("le numéro de la facture recherchée est : " + bills.stream().sorted((o1, o2) -> (int) (o2.computeAmountToPay() - o1.computeAmountToPay())).collect(Collectors.toList()).get(0).getBillId());
      
       
         // donne le numéro de la facture recherchée
        Bill bill3 = bills.get(0);
        for (Bill bill4 : bills) {
            if (bill4.computeAmountToPay() < bill3.computeAmountToPay()) {
                bill3 = bill4;
            }
        }
        System.out.println("le numéro de la facture recherchée est : " + bill3.getBillId());

        //stream max
        System.out.println("le numéro de la facture recherchée est : " + bills.stream().max((o1, o2) -> (int) (o1.computeAmountToPay() - o2.computeAmountToPay())).get().getBillId());
      

        System.out.println("---- les factures de + de 100000 ---");
        bills.stream().filter(bill13 -> bill13.computeAmountToPay() > 100000).forEach(bill12 -> System.out.println(" facture n° " + bill12.getBillId() + " total :" + bill12.computeAmountToPay()));

    }
}
