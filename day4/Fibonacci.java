package day4;
import java.util.Scanner;
/**
 * Here we print Fibonacci series upto a range
 * 'a','b' variables are initialized and series started from there
 * @author chandrashekar
 * @apiNote It's a program to print first n fibonacci numbers
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = scanner.nextInt();
        int alpha = 0, beta = 1;
        for (int iteration=0;iteration<=range;iteration++) {
            if (alpha % 3 == 0 && alpha % 5 == 0) {
                System.out.println(alpha + ": I am spiderman and ironman");
            } else if (alpha % 3 == 0) {
                System.out.println(alpha + ": I am spiderman");
            } else if (alpha % 5 == 0) {
                System.out.println(alpha + ": I am ironman");
            } else {
                System.out.println(alpha + ": I am zero");
            }
            int next = alpha + beta;
            alpha = beta;
            beta = next;
        }
        scanner.close();
    }
}
