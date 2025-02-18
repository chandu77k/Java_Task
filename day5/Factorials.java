package day5;
import java.util.*;
/**
 * This program generate factorial for given input
 * @author chandrashekar
 * @apiNote Factorial of a number
 */
public class Factorials {
	public static int fact(int number) {
		if(number==0) {
			return 1;
		}
		else {
			return number*fact(number-1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number : ");
		int number=scanner.nextInt();
		System.out.println("Factorial of "+number+" is "+fact(number));
		scanner.close();
	}

}
