package tech.kuba.sda.interfejsfunkcyjny;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdy {
    public static void main(String[] args) {
        Supplier<String> dostawca = () -> "Dostarczam";
        String s = dostawca.get();
        System.out.println(s);

        Consumer<String> zjadacz = text -> System.out.println(text);
        zjadacz.accept("Zjadam");

        ArrayList<String> lista = new ArrayList<>();
        Consumer<String> dodaj = dodajText -> System.out.println(dodajText);
        lista.add("Banana");
        dodaj.accept(lista.toString());

        long a = 6;
        Consumer<Long> kwadratLiczb = kwadrat -> System.out.println(kwadrat);
        kwadratLiczb.accept(a * a);

        Predicate<String> warunek = text -> text.contains("Warunek");
        System.out.println("Czy zawiera slowo Warunek?" + warunek.test("Warunek"));

//        Predicate<String> cyfra = c -> c.contains([0-9]*);
//        System.out.println("Czy zawiera cyfry 13246" + cyfra.test([0-9]*));

//        Predicate<Integer> warunekLiczbowy = (i) -> i% 15 == 0;

        Predicate<String> bialeZnaki = b -> {
            char[] say = b.toCharArray();
            int n = say.length;
            return n == 0 || Character.isWhitespace(0) || Character.isWhitespace(n -1);
        };

        Function<String, Integer> funkcja = (x) -> x.length();
        System.out.println(funkcja.apply(s));


        Function<String, Czlowiek> zamiana = x -> {
            String[] split = x.split(";");
            String imie = split[0];
            int wiek = Integer.parseInt(split[1]);
            return new Czlowiek(imie, wiek);
        };
        Czlowiek czlowiek = zamiana.apply("BorysJelcyn;25");
        System.out.println(czlowiek.getWiek());

        Function<LocalDate, LocalDateTime> funkcja1 = (x) -> x.atTime(12, 0);
        System.out.println(funkcja1.apply(LocalDate.now()));
    }
}
