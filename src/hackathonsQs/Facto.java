//4) Write a code to calculate factorial of a number.

package hackathonsQs;

import java.util.Scanner;

public class Facto {
	public static long Factorial(long num) {
		long fact = 1;
		for(long i=num ; i>0 ; i--) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to find factorial: ");
		long n = sc.nextLong();
		
		System.out.println(Facto.Factorial(n));
	}
}
