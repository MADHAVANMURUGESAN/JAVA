import java.util.Optional;
import java.util.Scanner;

public class OptionalValue {
    public static void main(String[] args) {

        String optionalString;
        Scanner scanner = new Scanner(System.in);
        optionalString = scanner.nextLine();
        System.out.println("optionalString: " + optionalString);

        // Creating an Optional with a non-null value
        //Optional<String> optionalName = Optional.of(optionalString);
        Optional<String> optionalName = Optional.ofNullable(optionalString);
        //System.out.println("optionalName.isPresent(): " + optionalName.isPresent());
        if (optionalName.isPresent()) {
            System.out.println("optionalName.get(): " + optionalName.get());
        }
        // Handling a potentially null value
        Optional<String> optionalNullable = Optional.ofNullable("hello");
        System.out.println("optionalNullable.orElse(\"Default Value\"): " + optionalNullable.orElse("Default Value"));

        //using ifpresent
        Optional<String> msg = Optional.of("java oracle...");
        msg.ifPresent(System.out::println);
    }
}
