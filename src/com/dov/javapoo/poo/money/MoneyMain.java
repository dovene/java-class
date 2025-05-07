package com.dov.javapoo.poo.money;

public class MoneyMain {
    public static void main(String[] args) {
        // Création des objets 
        Money dollar = new Money("dollar", 1.0f);
        Money euro = new Money("euro", 1.1f);

        // Affichage des informations
        System.out.println(dollar.getInformations());
        System.out.println(euro.getInformations());
      

        // Création et affichage de CryptoMoney
        CryptoMoney bitcoin = new CryptoMoney("Bitcoin", 50000f, "Bitcoin Block");
        System.out.println(bitcoin.getInformations());
    }

}
