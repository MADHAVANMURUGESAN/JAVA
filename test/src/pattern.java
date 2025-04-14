import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pattern value: ");
        int customValue =1;
        System.out.println("customValue%2: " + 3 / 2);
        System.out.println("customValue%2: " + 6 % 2);
        for (int i = 0; i < customValue; i++) {
            for (int j = 0; j < customValue; j++) {

                if (customValue / 2 == j || i==j )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
