import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value within (0-9):");
        int a = scanner.nextInt();
        if (a >= 0 && a <= 9) {
            System.out.println("It's true...");
        } else {
            System.out.println("It's false...");
        }
        System.out.println("Hello world!");
        Integer c = 10;
        incrementValue(c);
        System.out.println("c: " + c);
    }

    private static void incrementValue(Integer a) {
        a = a + 5;
    }
}