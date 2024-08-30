import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {
    public static void main(String[] args) {

        Map<Integer, String> hash_Map = new HashMap<>();
        hash_Map.put(2, "aaa");
        hash_Map.put(5, "bbb");
        hash_Map.put(1, "ddd");
        hash_Map.put(4, "ccc");
        System.out.println("hash_Map: " + hash_Map);
        for (Map.Entry<Integer, String> hashMap : hash_Map.entrySet()) {
            System.out.println("hashMap.getKey(): " + hashMap.getKey() + " " + "hashMap.getValue(): " + hashMap.getValue());
        }
        System.out.println("hash_Map.get(7): " + hash_Map.get(7));
        System.out.println("hash_Map.get(2): " + hash_Map.get(2));


        Map<Integer, Integer> linked_HashMap = new LinkedHashMap<>();
        for (int a = 1; a < 6; a++) {
            for (int b = a + 1; b > a; b--) {
                linked_HashMap.put(a, b);
            }
        }
        linked_HashMap.put(24, 125);
        linked_HashMap.put(0, 200);
        System.out.println("linked_HashMap: " + linked_HashMap);
        for (Map.Entry<Integer, Integer> linkedMap : linked_HashMap.entrySet()) {
            System.out.println(linkedMap.getKey() + " : " + linkedMap.getValue());
        }
        System.out.println("linked_HashMap.get(9): " + linked_HashMap.get(9));
        System.out.println("linked_HashMap.get(1): " + linked_HashMap.get(1));


        Map<Integer, Integer> tree_Map = new TreeMap<>();
        tree_Map.put(25, 123);
        tree_Map.put(18, 13);
        tree_Map.put(2, 97);
        tree_Map.put(5, 83);
        tree_Map.put(10, 2);
        System.out.println("tree_Map: " + tree_Map);
        for (Map.Entry<Integer, Integer> treeSet : tree_Map.entrySet()) {
            System.out.println(treeSet.getKey() + " : " + treeSet.getValue());
        }
        System.out.println("tree_Map.get(29): " + tree_Map.get(29));
        System.out.println("tree_Map.get(2): " + tree_Map.get(2));
        System.out.println("tree_Map.remove(0): " + tree_Map.remove(0));
        System.out.println("tree_Map.remove(10): " + tree_Map.remove(10));
        System.out.println("tree_Map: " + tree_Map);
        for (Map.Entry mapTree : tree_Map.entrySet()) {
            System.out.println(mapTree.getKey() + " : " + mapTree.getValue());
        }
    }
}
