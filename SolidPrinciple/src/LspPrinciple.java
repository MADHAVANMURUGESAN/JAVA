abstract class Birds{
    public abstract void eat();
}
class Sparrows extends Birds{

    @Override
    public void eat() {
        System.out.println("Sparrows is eat seeds and fruits...");
    }
}
class Penguins extends Birds{

    @Override
    public void eat() {
        System.out.println("Penguins is eat meat and fish...");
    }
}
public class LspPrinciple {
    public static void main(String[] args) {
        Sparrows sparrow= new Sparrows();
        Penguins penguins=new Penguins();
        sparrow.eat();
        penguins.eat();
    }
}
