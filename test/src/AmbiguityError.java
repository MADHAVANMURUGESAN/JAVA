public class AmbiguityError implements test2, test1 {
    public static void main(String[] args) {
        AmbiguityError ambiguityError = new AmbiguityError();
        ambiguityError.display();
    }
    @Override
    public void display() {
        test2.super.display();
    }
}

interface test1 {
    default void display(){
        System.out.println("Display the test1...");
    }
}

interface test2 {
    default void display(){
        System.out.println("Display the test2...");
    }
}