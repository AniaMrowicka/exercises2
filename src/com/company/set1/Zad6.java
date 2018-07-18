package com.company.set1;

public class Zad6 {
    public static void main(String[] args) {
//        Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
// Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która  na kolejkę/rollercoaster)
// jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.

        int waga =190;
        int wzrost =140;

        if (wzrost>150 ||waga>180){
            System.out.println("Nie mozna wejsc na kolejkę. Wzrost przekracza 150cm lub waga przekracza 180kg");
        }else System.out.println("Mozna wejsc");



    }
}
