package day6;
import java.util.*;
/**
 * This program generates gcd value
 * @author chandrashekar
 * @apiNote GCD program
 */
public class GcdCalc {
	public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = gcd(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + result);
        scanner.close();
	}
}
