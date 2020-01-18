package tech.kuba.sda.other;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ReferencjeDoMetod {

    public static void main(String[] args) {

        Predicate<String> warunek = ReferencjeDoMetod::mojWarunek;
        System.out.println(warunek.test("absd"));

        "dfdaf".isEmpty();
        Predicate<String> warunek1 = String::isEmpty;
        warunek1.test("");

        Consumer<String> zjadacz = System.out::println;
        zjadacz.accept("Im a man");

        ArrayList<String> slowa = new ArrayList<>();
        Consumer<String> zjadacz1 = (slowo) -> slowa.add(slowo);
        Consumer<String> zjadacz2 = slowa::add; //poprzez referencje

        Supplier<List<String >> podawacz = () -> new ArrayList<>();
        Supplier<List<String >> podawacz1 = ArrayList::new;
        List<String> strings = podawacz.get();
    }

    public static boolean mojWarunek(String txt)    {
        return txt.length() > 10;
    }
}
