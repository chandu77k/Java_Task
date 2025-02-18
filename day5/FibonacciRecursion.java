package day5;

import java.util.Scanner;
/**
 * This program generates fibonacci number upto given range
 * @author chandrashekar
 * @apiNote Generating Fibonacci series
 */

public class FibonacciRecursion {
	public static int fib(int number) {
	if(number<=1) {
		return number;
	}
	return fib(number-1)+fib(number-2);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number : ");
		int number=scanner.nextInt();
		System.out.println("Fibonacci series upto "+number+" :");
		for(int iter=0;iter<number;iter++) {
		System.out.println(fib(iter)+" ");
		}
		scanner.close();
	}
}
