package day6;
import java.util.*;
/**
 * This program generates sum of an array
 * @author chandrashekar
 * @apiNote Sum of numbers in an array
 */
public class ArraySum {
	public static int sum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements of the array:");
        for (int iteration = 0; iteration < number; iteration++) {
            arr[iteration] = scanner.nextInt();
        }
        int result = sum(arr, 0);
        System.out.println("Sum of the array is: " + result);
        scanner.close();
	}
}
