import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public MethodReference() {
        System.out.println("MethodReference...");
    }

    public void printf(String msg) {
        System.out.println("printf: " + msg);
    }

    public static void display(String str) {
        System.out.println("display: " + str);
    }

    public static void main(String[] args) {

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("jhoncena"));

        Consumer<String> consumer = MethodReference::display;
        consumer.accept("madhavan...");

        MethodReference methodReference = new MethodReference();
        Consumer<String> consumer1 = methodReference::printf;
        consumer1.accept("hello world...");

        Supplier<MethodReference> supplier = MethodReference::new;
        supplier.get();

        List<Integer> listNumber = Arrays.asList(1, 3, 4, 5, 6, 31, 5, 3, 4, 3, 2, 1);
        System.out.println("listNumber::" + listNumber);
        // Function<List<Integer>, Set<Integer>> setFunction =(list) -> new HashSet<>(list);
        Function<List<Integer>, Set<Integer>> setFunction = HashSet::new;
        System.out.println("setFunction:: " + setFunction);
        System.out.println("setFunction:: " + setFunction.apply(listNumber));

        List<String> listFruit = Arrays.asList("Guva", "banana", "applefruit", "Oranges");
        System.out.println(listFruit.stream().reduce((a, b) -> a.length() > b.length() ? a : b));

        Consumer<String> accepConsumer = (a) -> System.out.println("consumer:: " + a);
        accepConsumer.accept("madhavan...");
    }
}
