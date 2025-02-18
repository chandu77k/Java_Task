package day5;
import java.util.*;
/**
 * This program converts temperature from celsius to fahrenheit
 * @author chandrashekar
 * @apiNote Conversion of temperature
 */
public class CelsiusToFahrenheit {
	static void change(double celsius) {
		double fahrenheit=(celsius*1.8)+32;
		System.out.println("After converting into fahrenheit : "+fahrenheit);
	}
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter temperature in celsius : ");
		double celsius=scanner.nextDouble();
		change(celsius);
		scanner.close();
	}
}
