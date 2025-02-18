package exception_handling;
import java.util.*;
public class ValidateAge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=scanner.nextInt(); //Age as input
		try {//Doubted code in try block
			if(age<18) {
				throw new IllegalArgumentException("Age is less than 18");
				//throw manual exception
			}
			else {
				System.out.println("You can vote...");
			}
		}catch(IllegalArgumentException e) { //Catches the above exception
			System.out.println(e);
		}
	}
}
