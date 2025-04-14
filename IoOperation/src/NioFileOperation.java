import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NioFileOperation {
    public static void main(String[] args) {
        try {
            Files.writeString(Path.of("D:\\niotest.txt"), "hello niofile testing..." +
                    "hellos");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            List<String> lines = Files.readAllLines(Path.of("D:\\niotest.txt"));
            System.out.println(lines);
            lines.forEach(System.out::println);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
