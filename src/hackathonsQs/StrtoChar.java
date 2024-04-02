package hackathonsQs;

public class StrtoChar {
	public static void main(String[] args) {
		String str = "Welcome";
		char ch[] = str.toCharArray();
		
		for(int i=0 ; i<str.length() ; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("\nFrequency of characters in string is: "+ch.length);
	}
}