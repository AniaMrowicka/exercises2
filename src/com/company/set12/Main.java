package com.company.set12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List <Student> listastudentow = new ArrayList<>();
       Student student1 = new Student("123","Anna", "Mrowicka", Plec.KOBIETA);
       Student student2 = new Student("246","Adam", "Debowski", Plec.MEZCZYZNA);
       Student student3 = new Student("456","Ignacy", "Peplinki", Plec.MEZCZYZNA);
       Student student4 = new Student("802","Agata", "Kowalska", Plec.KOBIETA);
       Student student5 = new Student("789","Daria", "Danielowicz", Plec.KOBIETA);

        listastudentow.add(student1);
        listastudentow.add(student2);
        listastudentow.add(student3);
        listastudentow.add(student4);
        listastudentow.add(student5);



        for (Student wypisz:listastudentow) {
            System.out.println(wypisz);
        }
        znajdzNrIndeksu(listastudentow, "123");
    }
//    3. Stwórz metodę statyczną, która jako parametr przyjmuje listę studentów oraz numer indeksu studenta.
// W metodzie wykonaj obieg pętli przez listę studentów i spróbuj odnaleźć studenta z wybranym numerem indeksu.
// Po odnalezieniu studenta wypisz informacje o nim.
    public static void znajdzNrIndeksu (List<Student> listaStudentow, String numerIndeksu ){
        for (Student znajdzStudenta:listaStudentow) {
            if (znajdzStudenta.getNrIndeksu().equals(numerIndeksu)){
                System.out.println(znajdzStudenta);
            }
        }
    }
}
