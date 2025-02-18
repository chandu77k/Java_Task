package day4;
import java.util.Scanner;
/**
 * In this program we print prime numbers upto a range.
 * used switch case to print different conditions
 * @author chandrashekar
 * @apiNote It prints prime numbers upto a range
 */
public class Prime {
	public static void number(int range) {
		int count=0;
		int number=2;
		while(count<range) {
			boolean primenum=true;
		    for(int iteration=2;iteration<=Math.sqrt(number);iteration++) {
			if(number%iteration==0) {
				primenum = false;
				break;
			}
		}
		if(primenum) {
			switch(number) {
			case 2: case 3: case 5: case 7:
				System.out.println(number+ " is Small");
				break;
			default:
				if(number>=10 && number<=50) {
					System.out.println(number+" is Medium");
				}
				else {
					System.out.println(number+" is Large");
				}
				break;
			}
			count++;
			}
		number++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range : ");
		int range=sc.nextInt();
		number(range);
		sc.close();
		
	}

}
