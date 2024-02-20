//Question 2:Implement a method to check if a given string is a palindrome(reads the same forwards and backwards)
//ignoring case and non-alphanumeric characters.

package feb19;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		char[] rev = new char[ch.length];
		
		for(int i=ch.length-1 ; i>=0 ; i--) {
			rev[ch.length-i-1] = ch[i];
		}
		
		if(str.equals(toStr(rev))) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static String toStr(char[] ch) {
		String str = new String(ch);
		return str;
	}
}
