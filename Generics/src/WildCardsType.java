import java.util.List;

public class WildCardsType {
    // public static <T>
    public static void main(String[] args) {
        Boxing boxing = new Boxing();

        List<Integer> listInteger = List.of(1, 3, 5, 3, 6, 2, 6);
        System.out.println(boxing.getValue(listInteger, 2));
       //listInteger.add(3);
        List<String> listString = List.of("aa", "hdh", "hsh", "tey");
        System.out.println(boxing.getValue(listString, 1));
    }
}

class Boxing {
    /* public <T extends Number> Integer getValue(List<T> list, T item) {
         return (Integer) list.get(item.intValue());
     }*/
    public <T, U extends Number> T getValue(List<T> list, U item) {
        return list.get(item.intValue());
    }
}
