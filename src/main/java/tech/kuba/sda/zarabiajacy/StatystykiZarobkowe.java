package tech.kuba.sda.zarabiajacy;

import java.util.*;

public class StatystykiZarobkowe<T extends Zarabiajacy> {
    private List<T> listaPracownikow;

    public StatystykiZarobkowe(List<T> listaPracownikow) {
        listaPracownikow.sort(new PorownywaczZarobkow<>());
        this.listaPracownikow = listaPracownikow;
    }

    public static void main(String[] args) {

        List<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Robin", "Hood", "organista", 15400));
        pracownicy.add(new Pracownik("Borys", "Jelcyn", "przewodnik", 155000));
        pracownicy.add(new Pracownik("Dikembe", "Mutombo", "wikliniarz", 1400000));

        StatystykiZarobkowe<Pracownik> statystyki = new StatystykiZarobkowe<>(pracownicy);
        System.out.println(statystyki.zarabiajacyNajmniej().getImie());
        System.out.println(statystyki.zarabiajacyNajwiecej().getImie());

    }

    public T zarabiajacyNajmniej() {
        if (listaPracownikow.isEmpty()) {
            return  null;
        }
        return  listaPracownikow.get(0);
//        T tmp = null;
//        for (T t : listaPracownikow) {
//            if (tmp == null ||
//                    t.getRoczneWynagrodzenie() < tmp.getRoczneWynagrodzenie()) {
//                tmp = t;
//            }
//        }
//        return tmp;
    }


    public T zarabiajacyNajwiecej() {
        if (listaPracownikow.isEmpty()) {
            return  null;
        }
        return listaPracownikow.get(0);
//        T tmp = null;
//        for (T t : listaPracownikow) {
//            if (tmp == null ||
//                    t.getRoczneWynagrodzenie() > tmp.getRoczneWynagrodzenie()) {
//                tmp = t;
//            }
//        }
//        return tmp;
    }
}

