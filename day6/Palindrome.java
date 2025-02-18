package day6;
import java.util.*;
/**
 * This program checks palindrome condition
 * @author chandrashekar
 * @apiNote Check palindrome condition
 */
public class Palindrome {
	  public static boolean isPalindrome(String str, int start, int end) {
	        if (start >= end) {
	            return true;
	        }
	        if (str.charAt(start) != str.charAt(end)) {
	            return false;
	        }
	        return isPalindrome(str, start + 1, end - 1);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string to check if it's a palindrome: ");
	        String str = scanner.nextLine();
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        boolean result = isPalindrome(str, 0, str.length() - 1);
	        if (result) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        scanner.close();
	    }
}
