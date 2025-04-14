import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalAllMethod {
    public static void main(String[] args) {
        Predicate<String> isString = (a) -> !a.matches(".*\\d.*");
        System.out.println("isString: " + isString.test("mad2havan"));

        Supplier<String> supplierMethod = () -> "hello, ";
        System.out.println(supplierMethod.get() + "madhavan");

        Consumer<String> consumerDisplay = (str) -> System.out.println(str);
        consumerDisplay.accept("java developer...");

        Function<String, Integer> stringToInteger = (msg) -> msg.length();
        System.out.println("stringToInteger: " + stringToInteger.apply("madhssjd"));
        //System.gc();
        //Runtime.getRuntime().gc();
    }
}
