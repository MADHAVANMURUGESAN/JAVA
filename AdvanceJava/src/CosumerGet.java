import java.util.function.Consumer;

public class CosumerGet {
    public static void main(String[] args) {
        Consumer<String> consumer = (a) -> System.out.println("consumer: " + a);
        consumer.accept("consumer");
    }
}
