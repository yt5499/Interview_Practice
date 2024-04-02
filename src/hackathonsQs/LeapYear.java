//2) To write a code to find if a Given Year is a Leap Year.

package hackathonsQs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any year to check whether it is leap or not: ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("Entered year is a Leap year.");
		}else {
			System.out.println("Entered year is not a leap year.");
		}
	}
}
