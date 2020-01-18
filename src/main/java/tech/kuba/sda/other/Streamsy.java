package tech.kuba.sda.other;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsy {

    public static void main(String[] args) {

        List<String> imionaNazwiska = List.of("Grzegorz Brzeczyszczykiewicz",
                "Mateusz Borek",
                "Bronislaw Piotrzewski"
        );

        imionaNazwiska.forEach(System.out::println);

        Stream<String> strumien = imionaNazwiska.stream();
        Stream<String> strumienNazwisk = strumien
                .map((imieNazwisko) -> imieNazwisko.split(" ")[1]);
        Stream<Integer> strumienDlugosci = strumienNazwisk
                .map((nazwisko) -> nazwisko.length());
        Stream<Integer> strumienPrzefiltrowanychDlugosci = strumienDlugosci
                .filter((i) -> i > 7);
        List<Integer> listaDlugosci = strumienPrzefiltrowanychDlugosci
                .collect(Collectors.toList());
        System.out.println(listaDlugosci);

        //to samo co powyzej
        List<Integer> listaDlugosci1 = imionaNazwiska.stream()
                .map((imieNazwisko) -> imieNazwisko.split(" ")[1])
                .map(String::length)
                .filter((i) -> i > 7)
                .collect(Collectors.toList());
        System.out.println(listaDlugosci1);

        List<String> imiona = List.of("Barnaba Bronislaw Son-Goku",
                "Son-Gohan Dalailama Piccolo",
                "Spongebob Kuba Tomek");
        Stream<String> strumienImion = imiona.stream().flatMap((i) -> {
            String[] rozdzielone = i.split(" ");
            return Arrays.stream(rozdzielone);
        });
        strumienImion.forEach(System.out::println);

        List<List<String>> listaList = List.of(
                List.of("Barnaba", "Bronisław"),
                List.of(),
                List.of("Grzegorz", "Mateusz", "Ania"),
                List.of("Monika", "Agata", "Antoni"),
                List.of("Macierewicz")
        );
        List<String> listaSpłaszczona = listaList
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(listaSpłaszczona);
    }
}
