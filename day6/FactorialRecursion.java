package day6;
import java.util.*;
/**
 * This program generates output for factorial of a number
 * @author chandrashekar
 * @apiNote Factorial program using recursion
 */
public class FactorialRecursion {
	static int Factorial(int number) {
		if(number==0) {
			return 1;
		}
		else {
			return number*Factorial(number-1);
		}	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		Factorial(number);
		System.out.println(Factorial(number));
		scanner.close();
	}
}
