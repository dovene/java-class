package com.dov.javapoo.designpatterns.singleton;
import java.util.ArrayList;


public class BankAccountMain {
    public static void main(String[] args) {
       
        BankAccount account123 = new BankAccount(123, 200.0);
        account123.deposit(100.0);
        account123.withdraw(80.0);

        BankAccount account321 = new BankAccount(321, 0.0);
        account321.deposit(200.0);
        account321.withdraw(110.0);

  
        System.out.println("Journal des opérations");
        ArrayList<String> logs = MessageLogger.getInstance().getLogs();
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
