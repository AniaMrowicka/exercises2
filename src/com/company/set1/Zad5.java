package com.company.set1;

public class Zad5 {
    public static void main(String[] args) {
        boolean jest_cieplo = true;
        boolean wieje_wiatr =false;
        boolean swieci_slonce= true;

        boolean ubieram_sie_cieplo = !jest_cieplo  ||wieje_wiatr;
        boolean biore_parasol = !swieci_slonce && !wieje_wiatr;
        boolean ubieram_kurtke= wieje_wiatr && !swieci_slonce && !jest_cieplo;
    }
}
