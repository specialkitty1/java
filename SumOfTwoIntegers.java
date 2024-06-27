import java.util.Scanner;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        // Calculate the sum of the two integers
        int sum = firstInteger + secondInteger;

        // Print the sum
        System.out.println("The sum of the two integers is: " + sum);
    }
}
