package com.company.set1;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
//        Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych.
// Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
// Podatek obliczany jest wg. następujących reguł:
// do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
        Scanner sc = new Scanner(System.in);
        double dochod = sc.nextInt();
        double podatek= 0;
        if (dochod<85528){
            podatek = dochod * 0.18- 556.02;
            System.out.println("Podatek wynosi :" + podatek);
        } else {
            podatek = 14839.02;
            podatek = podatek + ((dochod - 85528) * 0.32);
            System.out.println("Podatek wynosi: " + podatek);
        }
    }
}
