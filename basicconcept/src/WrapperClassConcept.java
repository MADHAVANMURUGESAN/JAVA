public class WrapperClassConcept {
    public static void main(String[] args) {
        //autoboxing
        int value1 = 15;
        System.out.println("int value1: " + value1);
        Integer value2 = value1;
        System.out.println("Integer value2: " + value2);


        //unboxing
        Integer value3 = 25;
        System.out.println("Integer value3: " + value3);
        int value4 = value3;
        System.out.println("int value4: " + value4);
    }
}
