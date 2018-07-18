package com.company.set3;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc powtorzeń");
        int repeat = scanner.nextInt();

        for (int i = 1; i <=repeat ; i++) {
            System.out.println(i+ ". Hello World!");
        }
    }
}
