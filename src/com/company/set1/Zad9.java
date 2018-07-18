package com.company.set1;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj temperaturę (w stopniach Celsjusza):");
        double temperatura= scanner.nextInt();
        double stopnieFarenheita= (temperatura*1.8)+32.0;
        System.out.println("Temperatura Farenheita to: " + stopnieFarenheita);
    }
}
