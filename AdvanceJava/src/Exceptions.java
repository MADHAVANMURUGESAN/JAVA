class nullException extends /*RuntimeException*/Exception {
    public nullException(String str) {
      super(str);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int i = 0, j = 0;
        try {
            j = 18 / 20;
            if (j == 0)
                throw new nullException("Hellow");
           // throw new Exception("Divided by Zero...");

        } /*catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println("ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }*/catch (nullException e) {
            System.out.println("nullException: " + e);
        }
        System.out.println("output: " + j);
    }
}
