package com.dov.javapoo.gettingstarted;

import java.util.Arrays;

public class GettingStarted {

    public static void exo1() {
        int a = 12;
        int b = 34;
        int c = 45;
        int sum = a + b + c;
        System.out.println(a + "+" + b + "+" + c + "=" + sum);

        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Le minimum est :" + min);
    }

    public static void exo2() {
        int sumEven = 0;
        for (int i = 2; i <= 20; i += 2) {
            sumEven += i;
        }
        System.out.println("La somme des 10 premiers entiers naturels pairs est : " + sumEven);

        int sumEven2 = 0;
        for (int i = 0; i <= 20; i += 1) {
            if (i % 2 == 0) {
                sumEven2 += i;
            }
        }
        System.out.println("La somme des 10 premiers entiers naturels pairs est : " + sumEven2);
    }

    public static void exo3() {
        int[] input = {12, 23, 54, 89, 90, 67, 87};
        // Calculer la somme des éléments de la liste
        int sum = 0;
        for (int number : input) {
            sum += number;
        }
        System.out.println("Somme des éléments de la liste : " + sum);
        // Calculer la moyenne des valeurs de la liste
        double average = sum / (double) input.length;
        System.out.println("Moyenne des valeurs de la liste : " + average);

        // Calculer le maximum des valeurs de la liste
        int maximum = input[0];
        for (int number : input) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum des valeurs de la liste : " + maximum);
        // Trier la liste
        Arrays.sort(input);
        // Affiche la liste triée
        System.out.println("Liste triée : " + Arrays.toString(input));
    }

}
