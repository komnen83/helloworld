package tech.kuba.sda.firma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PlikFirma {

    private Firma firma;
    private List<Pracownik> listaPracownikow;

    public PlikFirma(Firma firma, List<Pracownik> listaPracownikow) {
        this.firma = firma;
        this.listaPracownikow = listaPracownikow;
    }

    public Firma zapis() throws FileNotFoundException {

        File plikFirma = new File("plikFirma.txt");
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
        return firma;
    }

    public Firma odczyt() throws IOException {
        Path outputFile = Paths.get("plikFirma.txt");
        byte[] bytes = Files.readAllBytes(outputFile);
        String content = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(content);
        return firma;
    }
}
