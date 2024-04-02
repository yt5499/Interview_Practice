package hackathonsQs;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int f = sc.nextInt();
		System.out.print("Enter second number: ");
		int s = sc.nextInt();
		
		System.out.println("Your entered numbers are:\nFirst: "+f+" \nSecond: "+s);
		
		Swapp obj = new Swapp();
		obj.swappBy2(f, s);	
	}
}

class Swapp{
	
//	LOGIC
//	a=10
//	b=20
	
//	b=10+20=30
//	a=b-a=20
//	b=b-a=10
	
	public void swappBy2(int first, int second) {
		second = first+second;
		first = second-first;
		second = second-first;
		System.out.println("Numbers after swapping are: \nFirst: "+first+" \nSecond: "+second);
	}
}
