package day4;
import java.util.Scanner;
/**
 * In this program we will print multiplication tables.
 * if the product is greater than 50 it breaks
 * if the product is multiple of 3 then it skips
 * @author chandrashekar
 * @apiNote It prints multiplication tables.
 */
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int number=sc.nextInt();
		System.out.println("Enter range : ");
		int range=sc.nextInt();
		for(int iteration=1;iteration<=range;iteration++) {
			int product = number*iteration;

			if(product>50) {
				break;
			}
			if(product%3==0) {
				continue;
			}
			System.out.println(number+" x "+iteration+" : " + product);
		}
		sc.close();

	}

}
