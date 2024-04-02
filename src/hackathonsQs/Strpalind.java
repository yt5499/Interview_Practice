package hackathonsQs;

public class Strpalind {
	public static void main(String[] args) {
		String str = "nayan";
		StringBuilder sb = new StringBuilder();
		
		char ch[] = str.toCharArray();
		
		for(int i=ch.length-1 ; i>=0 ; i--) {
			sb.append(ch[i]);
		}
		
		System.out.println(sb);
		
		String str2 = sb.toString();
		
		if(str.equals(str2)) {
			System.out.println("String is palindrome!");
		}else {
			System.out.println("String is NOT palindrome!");
		}
	}
}
