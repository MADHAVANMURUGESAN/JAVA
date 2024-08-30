class Sample {
    void call() {
        System.out.println("sample call method....");
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) {
        //toString(), hashCode(), getclass(), wait()
        //clone(), equals(), notify(), notifyall(), finalize()
        Sample sample1 = new Sample();
        System.out.println("sample1: " + sample1);
        System.out.println("sample1.toString(): " + sample1.toString());
        System.out.println("sample1.hashCode(): " + sample1.hashCode());
        System.out.println("sample1.getClass(): " + sample1.getClass());
        Object object = new String("madhavan");
        System.out.println("object: " + object);
        System.out.println("object.getClass(): " + object.getClass());
        Class class1 = object.getClass();
        System.out.println("class1: " + class1);
    }
}
