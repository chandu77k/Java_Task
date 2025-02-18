package day5;
import java.util.*;
/**
 * This program generates sum of digits upto a given range
 * @author chandrashekar
 * @apiNote Program for Sum of Digits
 */
public class SumOfDigits {
	static void sum(int number) {
		int addition=0;
		for(int iter=0;iter<=number;iter++) {
			addition=addition+iter;	
		}
		System.out.println("Addition of number from 1 to "+number+" : "+addition);
	}
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Range : ");
		int number=scanner.nextInt();
		sum(number);
		scanner.close();
	}
}
