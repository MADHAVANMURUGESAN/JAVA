import java.util.Scanner;

public class SwitchConcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value within (0-9):");
        int a = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 1, 2, 3, 4, 5:
                System.out.println("Entered value within 1-5...");
                break;
            case 6, 7, 8, 9:
                System.out.println("Entered value within 6-9...");
                break;
            case 'a', 'b':
                System.out.println("Entered value within a or b...");
                break;
            /*case "abi","ramu":*/
            default:
                System.out.println("entered value without limit...");
        }
        //swap a number
        int valueA, valueB;
        System.out.println("......Swap a value.......");
        System.out.println("Enter a value1: ");
        valueA = scanner.nextInt();
        System.out.println("Enter a value2: ");
        valueB = scanner.nextInt();
        valueA = valueA + valueB;
        valueB = valueA - valueB;
        valueA = valueA - valueB;
        System.out.println("A and B value: " + valueA + " " + valueB);
    }
}
