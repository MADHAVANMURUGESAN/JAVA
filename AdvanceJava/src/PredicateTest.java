import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (a) -> a.length() >= 10;
        System.out.println(predicate.test("predicatestr"));
    }
}
