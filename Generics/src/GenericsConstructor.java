public class GenericsConstructor {
    public static void main(String[] args) {
        ConstructorBox constructorBox = new ConstructorBox(2);
        constructorBox.display();
    }
}

class ConstructorBox {
    private final Integer area;

    <T extends Number> ConstructorBox(T item) {
        this.area = item.intValue();
    }

    public void display() {
        System.out.println("area: " + area);
    }
}