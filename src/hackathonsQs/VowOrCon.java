//3) To write a code to check Whether the Character is Vowel or Consonant.

package hackathonsQs;

import java.util.Scanner;

public class VowOrCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println("Enter any character to check whether it is vowel or consonant: ");
		char ch = sc.next().charAt(0);
		
		boolean flag = false;
		for(int i=0 ; i<vowel.length ; i++) {
			if(ch==vowel[i]) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("You entered Vowel");
		}else {
			System.out.println("You entered Consonant");
		}
	}
}
