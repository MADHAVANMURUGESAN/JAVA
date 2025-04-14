public class StringTest {
    public static void main(String[] args) {
       final Integer integer = 10;
        String msg = "hello";
        int a = 2;
        System.out.println(msg + a);
        System.out.println(msg + a + 4);
        System.out.println(msg + (a + 4));
        System.out.println(msg + integer + 7);
        System.out.println(msg + (integer + 7));
        System.out.println(msg + a + integer);
        System.out.println(msg + (a + integer));
    }
}
