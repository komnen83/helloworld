package tech.kuba.sda.other;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zbiory {

    public static void main(String[] args) {
        Set<String> ludzie = new HashSet<>();
        ludzie.add("Dominika");
        ludzie.add("Stefan");
        ludzie.add("Leo");
        ludzie.add("Lukasz");
        ludzie.add("Zenoby");
        ludzie.add("Justyna");

        ludzie.add("Stefan");
        System.out.println(ludzie);

        Iterator<String> iterator = ludzie.iterator(); // 1 sposob iteracji przez zbior
        while (iterator.hasNext()) {
            String osoba = iterator.next();
            System.out.println(osoba);
        }

        for(String osoba : ludzie)  {                  //2 sposob
            System.out.println(osoba);
        }

        boolean stefan = ludzie.contains("Stefan");
        System.out.println(stefan);
        System.out.println(ludzie.contains("Barbara"));

        System.out.println(ludzie.containsAll(List.of("Stefan", "Stefan")));

        ludzie.remove("Stefan");
        System.out.println(ludzie);
    }
}
