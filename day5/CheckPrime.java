package day5;
import java.util.*;
/**
 * This programs checks whether the given input is prime or not
 * @author chandrashekar
 * @apiNote Check prime or not
 */
public class CheckPrime {
	static boolean isprime(int number)
    {
        if (number <= 1) {
            return false;
        }
        for (int iter = 2; iter < number; iter++) {
            if (number % iter == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		if(isprime(number)) {
		System.out.println("It's Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		scanner.close();
	}
}

