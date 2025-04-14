
public class SingletonPattern {
    private SingletonPattern() {
    }

    private static SingletonPattern instance = new SingletonPattern();

    public static SingletonPattern getEagarInstance() {
        return instance;
    }
}

class Call {
    public static void main(String[] args) {
        SingletonPattern eagarSingleton1 = SingletonPattern.getEagarInstance();
        System.out.println("eagarSingleton1" + eagarSingleton1);
        SingletonPattern eagarSingleton2 = SingletonPattern.getEagarInstance();
        System.out.println("eagarSingleton2" + eagarSingleton2);
    }
}