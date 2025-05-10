import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {

        System.out.println("....sorted first letter based....");
        List<String> listName1 = new ArrayList<>(Arrays.asList("Madhavan", "Dhilip", "Bala", "ashok"));
        System.out.println("listName1:: " + listName1);
        Optional<List<String>> optionalList = Optional.of(
                listName1.stream()
                        .distinct()
                        .sorted(Comparator.comparing(a -> Character.toLowerCase(a.charAt(0))))
                        //.sorted(Comparator.comparing(a -> a.toLowerCase().charAt(0)))
                        .collect(Collectors.toList())
        );
        optionalList.ifPresent(System.out::println);

        System.out.println("....To find second biggest value....");
        String[] arrString = {"Madhavan", "Bala", "Ashok", "Ravi"};
        List<String> listName2 = new ArrayList<>(List.of(arrString));
        System.out.println("listName2:: " + listName2);
        Optional<String> optional = listName2.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        optional.ifPresent(System.out::println);

        System.out.println("....Sorted words length.....");
        List<String> listName3 = new ArrayList<>(List.of("Maddy", "Maddy", "balus", "harikumar", "Ravi", "jeevan"));
        System.out.println("listName3:: " + listName3);
        System.out.println("listName3:: " + listName3.stream().distinct().sorted(Comparator.comparing(a -> a.toLowerCase().charAt(0))).toList());
        Optional<String> optionalLength = listName3.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst();
        optionalLength.ifPresent(System.out::println);

        System.out.println("Array.contains: " + Arrays.asList("a", "b", "c").contains("c"));
        System.out.println("Array.contains: " + List.of("a", "b", "c").contains("C"));
        System.out.println("Array.contains: " + Stream.of("a", "j", "k", "l").anyMatch(a -> a.equalsIgnoreCase("A")));

        List<String> arrStr1 = new ArrayList<>(Arrays.asList("a", "b"));
        System.out.println("arrStr1: " + arrStr1);
        List<String> arrStr2 = List.of("a", "b");
        System.out.println("arrStr2: " + arrStr2);
        Stream<String> streamStr = Stream.of("a", "b", "c");
        System.out.println("streamStr: " + streamStr.toList());
        arrStr1.removeIf(n -> !n.equals("c"));
        System.out.println(arrStr1);



    }
}
