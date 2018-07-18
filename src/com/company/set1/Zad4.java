package com.company.set1;

public class Zad4 {
    public static void main(String[] args) {
//        Zadeklaruj 3 zmienne - zmienna 'a', zmienna 'b', zmienna 'c'. Przypisz jej 3 wartości - ważne żeby były różne. Następnie wykonaj na nich następujące działania:
//            a) przepisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b' przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.
//            b) wypisz wartości na ekran.
    int zmiennaA =2;
    int zmiennaB =3;
    int zmiennaC =4;
    int nowaZmienna = zmiennaA;
        zmiennaA =zmiennaB;
        zmiennaB=zmiennaC;
        zmiennaC=nowaZmienna;
        System.out.println(zmiennaA);
        System.out.println(zmiennaB);
        System.out.println(zmiennaC);


    }
}
