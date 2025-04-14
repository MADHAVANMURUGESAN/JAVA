import java.io.*;

public class BufferedOperation {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\bufferedtest.txt"));
            bufferedWriter.write("java developer best developer");
            bufferedWriter.close();
            System.out.println("successfully write");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\bufferedtest.txt"))) {
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.read());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
