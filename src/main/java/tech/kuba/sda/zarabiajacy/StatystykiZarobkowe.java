package tech.kuba.sda.zarabiajacy;

import java.util.*;

public class StatystykiZarobkowe <T extends  Zarabiajacy> {
    private List<T> listaPracownikow;

    public StatystykiZarobkowe(List<T> lista) {
        this.listaPracownikow = lista;
    }

    public List<T> getListaPracownikow() {
        return listaPracownikow;
    }


    public static void main(String[] args) {

        ArrayList<Pracownik> pracowniks = new ArrayList<>();
        pracowniks.add(new Pracownik("John", "Doe", "organista", 15400));
        pracowniks.add(new Pracownik("Borys", "Jelcyn", "przewodnik", 155000));
        pracowniks.add(new Pracownik("Dikembe", "Mutombo", "wikliniarz", 15400));

        StatystykiZarobkowe<Pracownik> pracownikStatystykiZarobkowe = new StatystykiZarobkowe<>(pracowniks);
        System.out.println(pracownikStatystykiZarobkowe.zarabiajacyNajmniej());
        System.out.println(pracownikStatystykiZarobkowe.zarabiajacyNajwiecej());

    }

    public List<T> zarabiajacyNajmniej() {
        return listaPracownikow;
    }

    public List<T> zarabiajacyNajwiecej() {
        return listaPracownikow;
    }

}
