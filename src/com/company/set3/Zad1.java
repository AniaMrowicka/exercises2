package com.company.set3;

public class Zad1 {
    public static void main(String[] args) {
//        liczby z zakresu 1 - 100 w nowych liniach
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);
        }
        System.out.println("Nastepne zadanie");
//liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
        for (int i = 1000; i <=1020 ; i++) {
            System.out.print(i+", ");
        }
        System.out.println("\nNastepne zadanie");
//liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
        for (int i =-30; i <=1000 ; i++) {
            if (i%5 ==0){
                System.out.println(i);
            }
        }
        System.out.println("\nNastepne zadanie");
//liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        for (int i = 1; i <=100 ; i++) {
            if (i%3 ==0){
                System.out.println(i);
            }
        }
        System.out.println("Nastepne zadanie");
//liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
        for (int i = 30; i <300 ; i++) {
          if (i%3 ==0 && i%5 ==0){
              System.out.println(i);
          }
        }
        System.out.println("Nastepne zadanie");
//liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        for (int i =-300; i <=300 ; i++) {
            if (i%2!=0){
                System.out.print(i+";");
            }
        }
        System.out.println("Nastepne zadanie");
//liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
        for (int i = -100; i <100 ; i++) {
            if (i%2==0){
                System.out.print(i+ ";");
            }
        }
        System.out.println("Nastepne zadanie");
//litery od 'a' do 'z'
        for (char i ='a'; i <='z' ; i++) {
            System.out.println(i);
        }
        System.out.println("Nastepne zadanie");
//litery od ‘A’ do ‘Z’
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.println(i);
        }
        System.out.println("Nastepne zadanie");
//litery od ‘A’ do ‘Z’, tylko co drugą
        for (int i = 65; i <=90 ; i++) {
            if (i%2==0){
                System.out.println((char)i);
            }
        }
        System.out.println("Nastepne zadanie");
//litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
        for (int i = 96; i <=122 ; i++) {
          if (i%2==0){
              if (i%5==0){
                  System.out.println((char)i);
              }
          }
        }
        System.out.println("Nastepne zadanie");
//‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania) np.
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i+".Hello world");
        }
    }
}
