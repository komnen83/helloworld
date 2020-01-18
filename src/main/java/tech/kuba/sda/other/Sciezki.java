package tech.kuba.sda.other;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.Calendar;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Sciezki {
    public static void main(String[] args) throws IOException {
        Path cwdRl = Paths.get("");
        System.out.println("sciezka: [" + cwdRl + "]");
        Path cwdAbs = cwdRl.toAbsolutePath();
        System.out.println("sciezka: [" + cwdAbs + "]");

        Path path = Paths.get("src/main/java/tech/kuba/sda/other/Sciezki.java");
        System.out.println(path);
        Path pathAbs = path.toAbsolutePath(); //sciezka bezzwgledna
        System.out.println(pathAbs);

        Path katalogKoduZrodlowego = Paths.get("src/main/java");
        Path plikZrodlowy = katalogKoduZrodlowego.resolve("tech/kuba/sda/other/Sciezki.java");
        Path parent = plikZrodlowy.getParent();
        System.out.println(parent);
        System.out.println(parent.getRoot()); //null, sciezka wzgledna nie ma roota
        System.out.println(parent.toAbsolutePath().getRoot());
        System.out.println(plikZrodlowy.getFileName());

        System.out.println(Files.exists(plikZrodlowy));
        System.out.println(Files.isDirectory(plikZrodlowy));
        System.out.println(Files.isRegularFile(plikZrodlowy));

        Path testdir = Paths.get("testdir");
        if(!Files.exists(testdir)) {
            Files.createDirectory(testdir);
        }
        System.out.println(Files.exists(testdir));

        Path kolejnyKatalog = testdir.resolve("banan/kwiecien");
//        Files.createDirectory(kolejnyKatalog); //wywali blad
        Files.createDirectories(kolejnyKatalog);

        Path plik = kolejnyKatalog.resolve("help.txt");
        if (!Files.exists(plik)) {
            Files.createFile(plik);
        }

        Path plik2 = plik.resolveSibling("jejku.txt");
        if (!Files.exists(plik2)) {
            Files.copy(plik, plik2);
        }

        Path plik3 = plik2.resolveSibling("zaraza.txt");
        if(!Files.exists(plik3)){
            Files.move(plik2, plik3);
        }

        Files.delete(plik);
        Files.deleteIfExists(plik2);
        Files.delete(plik3);

//        delete(testdir);

        int yy = LocalDate.now().getYear();
        for (int mm=1; mm<13;mm++){
            String miesiac = String.format("%02d", mm);
            Path folder = Paths.get("testMiesiace",yy + "-" + miesiac);
            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }
            Path plikKalendarz = folder.resolve(yy + "-" + miesiac+".txt");
            if (!Files.exists(plikKalendarz)) {
                Files.createFile(plikKalendarz);
            }
        }
    }

    public static void delete(Path path) throws IOException {
        if (Files.exists(path)) {
            if (Files.isRegularFile(path)) {
                System.out.println("removing " + path);
                Files.delete(path);
            } else if (Files.isDirectory(path)) {
                System.out.println("removing children of " + path);
                for (Path child : Files.newDirectoryStream(path)) {
                    delete(child);
                }
                System.out.println("removing " + path);
                Files.delete(path);
            } else {
                throw new RuntimeException();
            }
        }
    }
}

