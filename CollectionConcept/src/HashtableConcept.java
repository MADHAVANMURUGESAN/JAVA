import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableConcept {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash_Table = new Hashtable<>();
        hash_Table.put(6, "aa");
        hash_Table.put(5, "bb");
        hash_Table.put(2, "dd");
        hash_Table.put(3, "cc");
        System.out.println("hash_Table: " + hash_Table);
        Enumeration<Integer> hash_Key = hash_Table.keys();
        while (hash_Key.hasMoreElements()) {
            int key = hash_Key.nextElement();
            System.out.println(key + " : " + hash_Table.get(key));
        }
    }
}
