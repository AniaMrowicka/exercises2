package com.company.set2;

import java.util.Arrays;

public class Zad1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{ -3, 9, 2, -10, -3, -4, -1, -5, -10, 8};
        System.out.println(Arrays.toString(numbers));

        int min=0;

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]<min){
                min =numbers[i];
            }
        }
        System.out.println("najmnniejszy elemnt to: "+ min);
        int max=0;
        for (int i = 0; i <numbers.length ; i++) {
          if (numbers[i]>max){
              max = numbers[i];
          }
        }
        System.out.println("najwiekszy element to: " + max);

        double sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        double average= sum/numbers.length;
        System.out.println("Srednia to: "+ average);

       int wiekszeOdSredniej=0;
       int mniejszeOdSredniej=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]<average){
                mniejszeOdSredniej++;
            }
            if (numbers[i]>average){
                wiekszeOdSredniej++;
            }
        }
        System.out.println("ilosc liczb mneijszych od sredniej to: "+ mniejszeOdSredniej);
        System.out.println("ilosc liczb wiekszych od sredniej to: "+ wiekszeOdSredniej);


        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);

        }
    }

}
