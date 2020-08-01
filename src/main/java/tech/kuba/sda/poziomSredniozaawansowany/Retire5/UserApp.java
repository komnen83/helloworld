package tech.kuba.sda.poziomSredniozaawansowany.Retire5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserApp {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\komnen\\IdeaProjects\\helloworld\\src\\" +
                "main\\java\\tech\\kuba\\sda\\poziomSredniozaawansowany\\Retire5\\Users");

        DAO dao = new DAO();
        dao.readFile(path);

    }
}
