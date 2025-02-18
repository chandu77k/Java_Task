package day4;
import java.util.*;
/**
 * This program used to print the numbers which are divisible by 2,3
 * if the number is divisible by 5 it skips
 * @author chandrashekar
 * @apiNote It prints the numbers based on the given conditions
 */
public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int range=sc.nextInt();
		for(int iteration=1;iteration<=range;iteration++) {
			if(iteration%5==0) {
				continue;
			}
			if(iteration%2==0) {
				System.out.println(iteration+" is divisible by 2");
			}
			else if(iteration%3==0) {
				System.out.println(iteration+" is divisible by 3");
			}
		}
		sc.close();
	}
}
