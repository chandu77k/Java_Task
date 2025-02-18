package day6;
import java.util.*;
/**
 * This program generates output for the power calculation
 * @author chandrashekar
 * @apiNote Power Calculation
 */
public class PowerCalc {
	public static int power(int base,int expo) {
		if(expo==0) {
			return 1;
		}
		return base*power(base,expo-1);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter base : ");
		int base=scanner.nextInt();
		System.out.println("Enter exponent : ");
		int expo=scanner.nextInt();
		power(base,expo);
		System.out.println("Result : "+power(base,expo));
		scanner.close();
	}
}
