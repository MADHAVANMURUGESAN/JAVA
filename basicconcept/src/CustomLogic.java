import java.util.Scanner;

public class CustomLogic {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter custom value1:");
        int value1 = scanner.nextInt();
        System.out.println("Enter custom value2:");
        int value2 = scanner.nextInt();
        if(value1%3==0 && value2%5==0)
        System.out.println("Okay...");
        else
            System.out.println("Not okay...");
    }
}
