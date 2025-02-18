package day4;
import java.util.*;
/**
 * Here we print grades using the marks
 * In if condition i have checked whether the number is less than 0 or greater than 100
 * In else condition i have checked the grade points by the formula and divided the grade points 
 * @author chandrashekar
 * @apiNote It's a program to check grade points 
 */
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks=sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Invalid");
		}
		else {
			int gradepoint=marks/10;
			switch(gradepoint) {
			case 10: case 9:
				System.out.println("Grade A");
				break;
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
				System.out.println("Grade C");
				break;
			case 6:
				System.out.println("Grade D");
				break;
			default:
				System.out.println("Grade F");
				break;
			
			}
		}
		sc.close();
	}

}
