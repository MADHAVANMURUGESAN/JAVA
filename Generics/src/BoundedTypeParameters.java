public class BoundedTypeParameters {
    public static void main(String[] args) {
        Bounded<Integer> bounded1 = new Bounded<>(2);
        System.out.println(bounded1.getItem());
        Bounded<Double> bounded2 = new Bounded<>(12.3);
        System.out.println(bounded2.getItem());
    }
}

class Bounded<T extends Number> {
    private T item;

    Bounded(T item) {
        this.item = item;
    }

    double getItem() {
        return item.doubleValue();
    }
}