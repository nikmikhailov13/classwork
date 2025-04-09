package gmail.nikmikhailov13.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path pathToFile = Path.of("test.txt");
        Files.createFile(pathToFile);
        Files.writeString(pathToFile, "test0\ntest1\ntest2");

        List<String> strings = Files.readAllLines(pathToFile);
        System.out.println(strings);
    }

}
