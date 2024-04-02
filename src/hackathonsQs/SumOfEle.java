package hackathonsQs;

public class SumOfEle {
	public static void main(String[] args) {
		int n = 325;
		
		int sum = 0;
		while(n>=1) {
			int last = n%10;
			sum += last;
			n /= 10;
		}
		System.out.println("Sum of elements: "+sum);
	}
}
