
public class SingletonEagarPattern {
    private SingletonEagarPattern() {
    }

    private static SingletonEagarPattern instance = new SingletonEagarPattern();

    {
        System.out.println("create instance...");
    }

    public static SingletonEagarPattern getEagarInstance() {
        return instance;
    }
}

class SingletonLazyPattern {
    private SingletonLazyPattern() {
    }

    private static SingletonLazyPattern instance = null;

    public static SingletonLazyPattern getLazyInstance() {
        if (instance == null) {
            return new SingletonLazyPattern();
        }
        return instance;
    }
}

class Call {
    public static void main(String[] args) {
        SingletonEagarPattern eagarSingleton1 = SingletonEagarPattern.getEagarInstance();
        System.out.println("eagarSingleton1" + eagarSingleton1);
        SingletonEagarPattern eagarSingleton2 = SingletonEagarPattern.getEagarInstance();
        System.out.println("eagarSingleton2" + eagarSingleton2);

    }
}