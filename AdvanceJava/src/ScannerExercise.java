import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name please,");
        String name = scanner.nextLine();
        System.out.println("Welcome "+ name + " you're age please,");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Address please,");
        String address = scanner.nextLine();
        System.out.println("PLease confirm :: "+name +" "+age+" address is :: "+ address);
    }
}
