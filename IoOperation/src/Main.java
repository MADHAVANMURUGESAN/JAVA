import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("D:\\test.txt")) {
            fileWriter.write("helloworld");
            System.out.println("successfully written the file...");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        try (FileReader fileReader = new FileReader("D:\\test.txt")) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.println("fileReader: " + (char) ch);
                System.out.println("successfully readed the file...");
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

    }
}