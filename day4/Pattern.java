package day4;
import java.util.*;
/**
 * In this program we print the pattern based on the conditions
 * if the line number is even it print numbers
 * if the line number is odd it prints *
 * @author chandrashekar
 * @apiNote It prints patterns upto a range
 */

public class Pattern {
	public static void range(int number) {
		for (int iteration = 1; iteration <= number; iteration++) {
            for(int j_iter=1;j_iter<=iteration;j_iter++) {
            	if(iteration%2==0) {
            		System.out.print(iteration);
            	}
            	else {
            		System.out.print("*");
            	}
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int number=sc.nextInt();
		range(number);
		sc.close();
	}
}
