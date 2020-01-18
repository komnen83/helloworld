//package tech.kuba.sda.other;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class FolderyKalendarz2 {
//    public static void main(String[] args) {
//
//        int yy = 2020;
//        for (int mm = 1; mm < 13; mm++) {
//            String miesiac = String.format("%02d", mm);
//            Path folder = Paths.get("testMiesiace", yy + "-" + miesiac);
//            if (!Files.exists(folder)) {
//                Files.createDirectories(folder);
//            }
//            Path plikKalendarz = folder.resolve(yy + "-" + miesiac + ".txt");
//            if (!Files.exists(plikKalendarz)) {
//                Files.createFile(plikKalendarz);
//                Files.writeString(plikKalendarz,/* kalendarz(mm, yy)*/);
//            }
//        }
//    }
//}
