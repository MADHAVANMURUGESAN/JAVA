import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            String content = Files.readString(Path.of("Output.txt"));
            System.out.println("File Content:\n" + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
