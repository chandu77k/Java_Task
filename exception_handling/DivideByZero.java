package exception_handling;
import java.util.*;
public class DivideByZero {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int number=scanner.nextInt(); //input for 1st number
	int zero=0; //Second number as 0
	try { //Doubted code in try block
			int result=number/zero; //Divide by zero
			System.out.println(result);
	}catch(ArithmeticException e) { //Catches the exception
		System.out.println(e+" Error : Number can't be diided by zero");
	}
	scanner.close();
	}
}