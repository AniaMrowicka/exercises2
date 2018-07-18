package com.company.set1;

public class Zad7 {
    public static void main(String[] args) {
        int waga = 190;
        int wzrost = 140;
        int wiek = 9;


        if ((waga < 180) || (wzrost < 150) || (wzrost > 220) || (wiek < 10 || wiek > 80)) {
            if (waga > 180) {
                System.out.println("Nie mozna wejsc na kolejkę. waga przekracza 180kg");
            }
            if (wzrost > 150 || wzrost > 220) {
                System.out.println("Nie mozna wejsc na kolejkę. Wzrost nie miesci się w przedziale 150-220cm");
            }
            if (wiek < 10 || wiek > 80) {
                System.out.println("Nie mozna wejsc na kolejkę. Wiek nie miesci się w przedziale 10-80lat");

            }

            else System.out.println("Mozna wejsc");
        }

    }
}
