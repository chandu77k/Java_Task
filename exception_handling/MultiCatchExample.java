package exception_handling;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Array: [10, 20, 30, 40, 50]");
        System.out.print("Enter an index to retrieve a number: ");
        String input = scanner.nextLine();
        
        try {
            // Attempt to parse the input and retrieve the number from the array
            int index = Integer.parseInt(input);
            System.out.println("Number at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // Handle both exceptions in a multi-catch block
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}

