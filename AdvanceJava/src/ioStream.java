import java.io.*;

public class ioStream {
    public static void main(String[] args) throws IOException {
       /* FileInputStream reader = null;
        FileOutputStream writer = null;*/
        FileReader reader = null;
        FileWriter writer = null;
        try {
         /*   reader = new FileInputStream("C:\\Users\\Madhavan\\Documents\\intellij\\New folder\\test.txt");
            writer = new FileOutputStream("C:\\Users\\Madhavan\\Documents\\intellij\\New folder\\test1.txt");*/
            reader = new FileReader("C:\\Users\\Madhavan\\Documents\\intellij\\New folder\\test.txt");
            writer = new FileWriter("C:\\Users\\Madhavan\\Documents\\intellij\\New folder\\test1.txt");
            int cont;
            while ((cont = reader.read()) != -1) {
           /*writer.write((byte)cont);*/
            writer.append((char) cont);
            }
        } finally {
            if(reader != null){
                reader.close();
            }
        }
    }
}
