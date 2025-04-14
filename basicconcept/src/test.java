import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        byte a = -128;
        System.out.println(a);
        List<String> arrayList1 = new ArrayList<>(Arrays.asList("a1", "a2", "a3"));
        arrayList1.add("a6");
        System.out.println("arrayList1: " + arrayList1);
        List<String> arrayList2 = new ArrayList<>(List.of("b1", "b2", "b5"));
        arrayList2.add("b8");
        System.out.println("arrayList2: " + arrayList2);
        List<Integer> arrayList3 = List.of(12, 4, 19, 15, 1, 3);
        //arrayList3.add("c7");
        System.out.println("arrayList3: " + arrayList3);
        System.out.println(arrayList3.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get());
    }
}
