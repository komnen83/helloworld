package tech.kuba.sda.other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        List<String> lista = lista1; //moze byc ArrayList albo LinkedList
        lista = lista2;

        lista.add("A");
        lista.add(0, "B");
        lista.set(0, "C");
        System.out.println(lista);

        lista.addAll(1, lista);
        System.out.println(lista);

        System.out.println(lista.contains("X")); // czy lista zawiera X
        System.out.println(lista.containsAll(lista)); //czy lista zawiera liste

        ArrayList<String > lista3 = new ArrayList<>();
        lista3.add("A");
        lista3.add("C");
        System.out.println(lista.containsAll(lista3)); //czy lista zawiera liste bez wzgledu na kolejnosc elementow

        lista.add("F");
        lista.remove("C");
        System.out.println(lista);

        lista.removeAll(lista3); //usuwa liste z listy
        System.out.println(lista);
        System.out.println(lista.get(0));

        int size = lista.size();
        System.out.println(size);

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(5);
        liczby.add(4);
        liczby.add(3);
        liczby.add(2);
        liczby.add(1);
        liczby.add(0);
        System.out.println(liczby);
        liczby.sort(null); //sortowanie od najm do najw
        System.out.println(liczby);
        liczby.sort(Comparator.naturalOrder()); //to samo co null
        System.out.println(liczby);
        liczby.sort(Comparator.reverseOrder());
        System.out.println(liczby);

    }
}
