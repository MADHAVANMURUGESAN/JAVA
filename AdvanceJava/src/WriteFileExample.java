import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            String content = "Hello, this is a sample text.";
            Files.writeString(Path.of("output.txt"), content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
