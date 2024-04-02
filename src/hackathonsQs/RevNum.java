package hackathonsQs;

public class RevNum {
	public static void main(String[] args) {
		int reverse = rev(56);
		System.out.println("Reverse: "+reverse);
	}
	
	public static int rev(int num) {
		int rev = 0;
		while(num>=1) {
			int last = num % 10;
			rev = (rev*10)+last;
			num /= 10;
		}
		return rev;
	}
}