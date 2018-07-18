package com.company.set1;

public class Zad8 {
    public static void main(String[] args) {
       float ocenaMatematyka =5.0f;
       float ocenaChemia=4.0f;
       float ocenJPolski = 5.0f;
       float ocenaJAngielski = 3.0f;
       float ocenaWos = 1.0f;
       float ocenaInformatyka= 2.0f;

       float sredniaWszystkich= (ocenaChemia+ocenaInformatyka+ocenaJAngielski+ocenaMatematyka+ocenaWos+ocenJPolski)/6;
        System.out.println(sredniaWszystkich);
        float sredniaScisle = (ocenaMatematyka+ocenaChemia+ocenaInformatyka)/3;
        System.out.println(sredniaScisle);
        float sredniaHuman = (ocenaJAngielski+ocenaWos+ocenJPolski)/3;
        System.out.println(sredniaHuman);



        if (sredniaHuman<=1.9){
            System.out.println("ocena z cześci Humanistycznej jest niedostateczna");
        }
        if (sredniaScisle<=1.9){
            System.out.println("ocena z cześci przedmiotow scisnych jest niedostateczna");
        }
        if (ocenaChemia<=1 || ocenaInformatyka<=1 || ocenaJAngielski<=1 || ocenaMatematyka<=1 ||ocenaWos<=1 || ocenJPolski<=1){
           if (ocenaChemia<=1){
               System.out.println("Ocena z chemii jest niedostateczna");
           }
           if (ocenaInformatyka<=1){
               System.out.println("Ocena z informatyki jest niedostateczna");
           }
           if (ocenaJAngielski<=1){
               System.out.println("Ocena z języka angielskiego jest niedostateczna");
           }
           if (ocenaMatematyka <=1){
               System.out.println("Ocena z matematyki jest niedostateczna");
           }
           if (ocenaWos<=1){
               System.out.println("ocena z Wosu jest niedostateczna");
           }
            if (ocenJPolski <= 1) {
                System.out.println("Ocena z języka poslkiego est niedostateczna");
            }
        }
    }
}
