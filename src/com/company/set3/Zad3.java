package com.company.set3;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
//        Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.
        Scanner scanner = new Scanner(System.in);
        int repeat;

        do {
            System.out.println("Podaj ilość powtórzeń( wieksze niz 0");
            repeat = scanner.nextInt();
            for (int i = 1; i <= repeat; i++) {
                System.out.println("Hello World");
            }
        } while (repeat > 0);
        System.out.println("liczba powtórzen równa bądz mniejsza niż 0");
    }
}

