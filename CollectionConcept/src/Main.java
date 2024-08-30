import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    }
}