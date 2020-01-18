package tech.kuba.sda.other;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Io {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(200);
        baos.write(201);
        baos.write(202);
        byte[] bytes = baos.toByteArray();
        System.out.println(Arrays.toString(bytes));
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int read1 = bais.read();
        System.out.println(read1);

        byte[] buf = new byte[1024];
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();

        int read;
        while ((read = bais.read(buf)) != -1) {
            baos2.write(buf, 0, read);
        }
        byte[] wszystkie = baos2.toByteArray();
        System.out.println(Arrays.toString(wszystkie));

        Path path = Paths.get("help.txt");
        OutputStream outputStream = Files.newOutputStream(path);
        outputStream.write(65);
        outputStream.write(66);
        outputStream.write(67);
        outputStream.write(68);
        outputStream.close();

        InputStream inputStream = Files.newInputStream(path);
        byte[] b = new byte[4];
        inputStream.read(b);
//        for(int i = 0; i < 4; i++) {
//            System.out.println(inputStream.read());
//        }
        inputStream.close();
        String s = new String(b, StandardCharsets.US_ASCII);
        System.out.println(s);

        BufferedReader reader = Files.newBufferedReader(path);
        String s1 = reader.readLine();
        System.out.println(s1);

        BufferedReader reader1 = Files.newBufferedReader(path);
        char[] cbuf = new char[1024];
        int ilośćOdczytanych;
        StringBuilder sb = new StringBuilder();
        while ((ilośćOdczytanych = reader1.read(cbuf)) != -1) {
            sb.append(cbuf, 0, ilośćOdczytanych);
        }
        String zawartość = sb.toString();
        System.out.println(zawartość);
        reader1.close();

        BufferedWriter writer = Files.newBufferedWriter(
                path,
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE);
        writer.write("Jest niedziela a ja pracuje...");
        writer.close();

        Path inputPath = Paths.get("input");
        Path outputPath = Paths.get("output.txt");

        //try-with-resources
        try (BufferedReader reader2 = Files.newBufferedReader(inputPath); //w tym przypadku nie potrzebujemy metody close()
             BufferedWriter writer2 = Files.newBufferedWriter(outputPath);
        ) {

            //cbuf jest zadeklarowany wczesniej
            int ilośćOdczytanych1 = reader2.read(cbuf);
            while (ilośćOdczytanych1 != -1) {// kiedy nie ma juz innych danych funkcja zwraca minus 1,
                writer2.write(cbuf, 0, ilośćOdczytanych1);//zakres od zera do int ilośćOdczytanych
                ilośćOdczytanych1 = reader2.read(cbuf);
            }
        }

        String output = Files.readString(outputPath); //szybki odczyt
        System.out.println(output);

        List<String> outputLines = Files.readAllLines(outputPath); //szybki odczyt
        for (String outputLine : outputLines) {
            System.out.println(outputLine);
        }

        byte[] bytes1 = Files.readAllBytes(outputPath); //szybki odczyt
        String outputFromBytes = new String(bytes1, StandardCharsets.UTF_8);
        System.out.println(outputFromBytes);

        Path outputPath2 = Paths.get("output2.txt");
        Files.write(outputPath2, bytes1);
        Files.writeString(Paths.get("output3.txt"), "Cześć, jestem Krystian");
        Files.write(Paths.get("output4.txt"), outputLines);
    }
}

