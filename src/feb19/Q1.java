//Question 1: Write a program to reverse a string without using any built-in reverse() method.

package feb19;

public class Q1 {
	public static void main(String[] args) {
		String str = "Welcome";
		
		char ch[] = str.toCharArray();
		
		System.out.println("Original String: "+str);
		
		System.out.print("Reversed String: ");
		for(int i=ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
	}
}
