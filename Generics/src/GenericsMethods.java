import java.util.Arrays;

public class GenericsMethods {
    public static void main(String[] args) {
        Box box = new Box();
        box.processPrint(new Object[]{1, 3, 43});
        System.out.println(box.progress("hellow"));
    }
}

class Box {
    public <T> void processPrint(T[] print) {
        for (T item : print) {
            System.out.println("item: " + item);
        }
        System.out.println(Arrays.stream(print).toList());
        System.out.println(Arrays.toString(print));

    }

    public <T> T progress(T item) {
        return item;
    }
}