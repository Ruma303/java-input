import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        // Read an integer from the user
        int intValue = scanner.nextInt();

        scanner.nextLine(); // Consume the newline left-over

        System.out.print("Enter a string: ");

        // Read a string from the user
        String stringValue = scanner.nextLine();

        System.out.println("You entered the integer: " + intValue);
        System.out.println("You entered the string: " + stringValue);

        scanner.close();
    }
}