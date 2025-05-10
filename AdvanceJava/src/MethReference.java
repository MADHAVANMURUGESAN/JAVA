import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Manipulate {

    public static void printer1(String str) {
        System.out.println(str);
    }

    public void printer2(String string) {
        System.out.println(string);
    }
}

public class MethReference {
    public String s;

    MethReference(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        List<String> printerName = new ArrayList<>(Arrays.asList("HP", "Lenovo", "LG", "Usha"));

        //reference to static method
        printerName.forEach(Manipulate::printer1);

        //reference to class object method
        printerName.forEach(new Manipulate()::printer2);

        //reference to object method of attribute
        printerName.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        //reference to constructor
        List<MethReference> manipulates = printerName.stream().map(MethReference::new)
                .toList();

    }
}
