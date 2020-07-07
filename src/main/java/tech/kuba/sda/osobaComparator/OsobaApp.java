package tech.kuba.sda.osobaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OsobaApp {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("james", "w", 99);
        Osoba osoba2 = new Osoba("james", "a", 77);
        Osoba osoba3 = new Osoba("wit", "c", 177);

        List<Osoba> osoby = new ArrayList<>();

        osoby.add(osoba1);
        osoby.add(osoba2);
        osoby.add(osoba3);

        System.out.println("Przed sortowaniem");
        for(int i = 0; i < osoby.size(); i++) {
            System.out.println(osoby.get(i));
        }
        System.out.println("\n");

        Collections.sort(osoby, new OsobaComparator());

        System.out.println("Po sortowaniu");
        for(int i = 0; i < osoby.size(); i++) {
            System.out.println(osoby.get(i));
        }
    }
}



