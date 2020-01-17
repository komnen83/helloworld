package tech.kuba.sda.firma;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FirmaApp {
    public static void main(String[] args) throws IOException {

        Pracownik pracownik1 = new Pracownik("Borys", "Jelcyn", 7777);
        Pracownik pracownik2 = new Pracownik("Jimmy", "Hendrix", 14789);
        Pracownik pracownik3 = new Pracownik("James", "Bond", 7979879);

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);

        Firma firma = new Firma("Microsoft", "Bill Gates", listaPracownikow);

        PlikFirma plikFirma = new PlikFirma(firma, listaPracownikow);
        plikFirma.zapis();
        plikFirma.odczyt();

    }
}
