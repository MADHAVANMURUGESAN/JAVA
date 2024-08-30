 class SingletonClass {

    public static SingletonClass singletonClass = null;

    private SingletonClass() {

    }

    public static synchronized SingletonClass getInstance() {
        if (singletonClass == null)
            singletonClass = new SingletonClass();
        return singletonClass;
    }
}

public class SingleClass {
    public static void main(String[] args) {
        System.out.println("singletonClass....");
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println("obj1.hashcode(): "+obj1.hashCode());
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println("obj2.hashcode(): "+obj2.hashCode());

        if(obj1==obj2){
            System.out.println("obj1==obj2");
        }else {
            System.out.println("obj1!=obj2");
        }

    }
}