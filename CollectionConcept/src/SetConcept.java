import java.util.*;

public class SetConcept {
    public static void main(String[] args) {
        Set<Integer> hash_Set = new HashSet<>();
        hash_Set.add(2);
        hash_Set.add(1);
        hash_Set.add(7);
        hash_Set.add(2);
        hash_Set.add(5);
        hash_Set.add(null);
        System.out.println("hash_Set: " + hash_Set);
        System.out.println("hash_Set.remove(0): " + hash_Set.remove(0));

        Set<Integer> linked_Hash_Set = new LinkedHashSet<>();
        linked_Hash_Set.add(7);
        linked_Hash_Set.add(4);
        linked_Hash_Set.add(2);
        linked_Hash_Set.add(null);
        linked_Hash_Set.add(6);
        linked_Hash_Set.add(4);
        linked_Hash_Set.add(null);
        System.out.println("linked_Hash_Set: " + linked_Hash_Set);
        System.out.println("linked_Hash_Set.remove(0): " + linked_Hash_Set.remove(0));
        System.out.println("linked_Hash_Set.remove(6): " + linked_Hash_Set.remove(6));
        System.out.println("linked_Hash_Set: " + linked_Hash_Set);
        Set<Integer> linked_Hash_Set1 = new LinkedHashSet<>();
        linked_Hash_Set1.addAll(Arrays.asList(new Integer[]{2, 6, 4, 2, 5, 12}));
        System.out.println("linked_Hash_Set1: " + linked_Hash_Set1);
        linked_Hash_Set1.retainAll(linked_Hash_Set);
        System.out.println("linked_Hash_Set1.retainAll(linked_Hash_Set): " + linked_Hash_Set1);

        Set<Integer> tree_Set = new TreeSet<>();
        tree_Set.add(10);
        tree_Set.add(15);
        tree_Set.add(2);
        tree_Set.add(8);
        tree_Set.add(4);
        tree_Set.add(13);
        System.out.println("tree_Set: " + tree_Set);
        System.out.println("tree_Set.remove(0): " + tree_Set.remove(0));
        System.out.println("tree_Set.remove(13): " + tree_Set.remove(13));
        System.out.println("tree_Set: " + tree_Set);
    }
}
