import java.util.*;

public class ListConcept {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        System.out.println("arrayList: " + arrayList);
        arrayList.remove(2);
        System.out.println("arrayList: " + arrayList);
        System.out.println("arrayList.indexOf(2): " + arrayList.indexOf(7));


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            linkedList.add(i);
        System.out.println("linkedList: " + linkedList);
        linkedList.remove(2);
        System.out.println("linkedList: " + linkedList);


        // Declaring the Vector
        Vector<Integer> vector = new Vector<Integer>();
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            vector.add(i);
        System.out.println("vector: " + vector);
        vector.remove(2);
        vector.add(8);
        System.out.println("vector: " + vector);


        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");
        System.out.println("stack: " + stack);
        stack.pop();
        System.out.println("stack: " + stack);
        stack.add("hello");
        System.out.println("stack: " + stack);
        System.out.println("stack: " + stack.peek());
        System.out.println("stack: " + stack);

    }
}
