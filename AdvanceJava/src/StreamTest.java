import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] arg) {
        String[] arrayList = {"a", "orange", "banana"};
        List<String> list1 = List.of(arrayList);
        List<String> list2 = List.of("a", "b", "c", "d");
        List<String> list3 = Arrays.asList(arrayList);
        List<String> list4 = list3.stream().toList();
/*
       //getting error
        list1.add("2");
        list3.add("2");
        list4.add("a");
*/
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list4.stream().sorted().toList());
        List<String> listString = list4.stream()
                .filter(Objects::nonNull)
                .map(a -> a.isEmpty() ? a : a.substring(0, 1).toUpperCase() + a.substring(1))
                .collect(Collectors.toList());
        System.out.println(listString);
        String a = "a";
        System.out.println(a.substring(0, 1));
        System.out.println(a.substring(1));
    }
}
