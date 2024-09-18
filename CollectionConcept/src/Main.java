import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int a = 0; a < 6; a++)
            list.add(a);
        System.out.println("list: " + list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (3 == iterator.next()) {
                iterator.remove();
                System.out.println("successfully removed....");
            }
        }
        System.out.println("list: " + list);

        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        // Converting map keys to a list
        List<Map<String, Integer>> keysList = Arrays.asList(new Map[]{map});
        List<int[]> keysList1 = Arrays.asList(new int[]{2, 3, 5, 3});


        System.out.println("keysList: "+keysList);

    }

}