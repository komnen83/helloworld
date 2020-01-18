package tech.kuba.sda.firma;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FirmaApp {
    public static void main(String[] args) throws IOException {

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(new Pracownik("Borys", "Jelcyn", 7777));
        listaPracownikow.add(new Pracownik("Jimmy", "Hendrix", 14789));
        listaPracownikow.add(new Pracownik("James", "Bond", 7979879));

        Firma firma = new Firma("Microsoft", "Bill Gates", listaPracownikow);

        PlikFirma plikFirma = new PlikFirma(firma, listaPracownikow);
        plikFirma.zapis();
        plikFirma.odczyt();

    }
}
