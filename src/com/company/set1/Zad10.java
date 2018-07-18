package com.company.set1;

public class Zad10 {
    public static void main(String[] args) {
//        Zadeklaruj trzy zmienne (liczby). Wypisz na ekran wszystkie z nich, a następnie wypisz na ekran największą oraz najmniejszą z nich.
        int a =2;
        int b= 6;
        int c=22;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int max=0;
        int min =0;
       if (a>b) {
           max = a;
           min=b;
       }else{ max = b; min =a;}
       if (a<c){
          max=c;
          min =a;
       }
       System.out.println("Max to: "+ max);
       System.out.println("Min to: " +min);
       }

    }

