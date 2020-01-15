package tech.kuba.sda.firma;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        File plikFirma = new File("plikFirma.txt");
        Path outputFile = Paths.get("plikFirma.txt");
        PrintWriter writer = new PrintWriter(plikFirma);

        writer.write(
                "Firma: <" + firma.getNazwaFirmy() + ">\n" +
                        "Szef: <" + firma.getSzef() + ">;\n" +
                        "Pracownicy: <" + listaPracownikow.size() +
                        ">;\n"
        );
        for (Pracownik pracownik : listaPracownikow) {
            writer.write(
                    "<" + pracownik.getImie() +
                            " " + pracownik.getNazwisko() + ">;" +
                            "<" + pracownik.getWynagrodzenie() + ">;\n");
        }
        writer.close();

        byte[] bytes = Files.readAllBytes(outputFile);
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);
    }
}
