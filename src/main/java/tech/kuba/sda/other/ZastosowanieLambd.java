package tech.kuba.sda.other;

import java.util.*;
import java.util.function.Consumer;

public class ZastosowanieLambd {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>(List.of("Adam", "Piotr", "Benjamin"));

        imiona.forEach(System.out::println);

//        for(List imie : imiona) {
//            System.out.println(imie);
//        }

        Consumer<String> l = (t) -> System.out.println(t); //iteracja przy pomocy wyrazenia lambda
        Consumer<String> mr = System.out::println; //iteracja przy pomocy referencji
        imiona.forEach((t) -> System.out.println(t));

        imiona.replaceAll((s -> s.toLowerCase()));
        System.out.println(imiona);
        imiona.replaceAll(String::toUpperCase);
        System.out.println(imiona);

        imiona.removeIf((imie) -> imie.length() <= 4);
        System.out.println(imiona);

        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("Bob");

//        Optional<String> optional3 = x == null ? Optional.empty() : Optional.of(); //to samo co ponizej
        Optional<String> optional3 = Optional.ofNullable(null);

//        optional1.get();
        boolean present = optional1.isPresent();
        boolean empty = optional1.isEmpty();
        String s = optional1.orElse("XXXX");

        optional1.orElseGet(() -> {
            System.out.println("Optional jest pusty, zwracam domyslna wartosc");
            return "XXXX";
        });

//        String s1 = optional1.orElseThrow(() -> new RuntimeException());

        Optional<String> o1 = Optional.of("Bob");
        Optional<Integer> l1 = o1.map((imie) -> 32 * imie.length());
        System.out.println(o1.isPresent());

        Optional<String> o2 = Optional.empty();
        o2.map((imie) -> 32 * imie.length());
        System.out.println(o2.isPresent());

        Optional<Integer> liczba = optional2.map((imie) -> 32 * imie.length()); //pakuje do optional

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Krzysztof", "Gonciarz");
        String s2 = mapa.get("Krzysztof");
        if (s2 != null) {
            int length = s2.length();
            System.out.println(length);
        }
        Optional<String> nazwisko = Optional.ofNullable(mapa.get("Krzysztof"));
        nazwisko.map((n) -> n.length()).ifPresent(System.out::println);

        Optional.of("Bob").filter((g) -> g.length() < 4);

        Map<String, Integer> budzety = new HashMap<>();

            Optional<Optional<Integer>> y1 = Optional
                    .of("Bob")
                    .map((g) -> Optional.of(g.length()));

            Optional<Integer> y2 = Optional
                    .of("Bob")
                    .flatMap((g) -> Optional.ofNullable(budzety.get(g)));
        System.out.println(y1);
        System.out.println(y2);

    }
}
