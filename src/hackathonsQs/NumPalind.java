package hackathonsQs;

public class NumPalind {
	public static void main(String[] args) {
		int num = 125211;
		int temp = num;
		
		int rev = 0;
		while(temp>=1) {
			int last = temp % 10;
			rev = (rev * 10) + last;
			temp /= 10;
		}
		
		if(rev==num) {
			System.out.println("Number is palindrome!");
		}else {
			System.out.println("Number is NOT a palindrome!");
		}
	}
}
