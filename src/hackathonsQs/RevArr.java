package hackathonsQs;

import java.util.Arrays;

public class RevArr {
	static void revArr(int arr1[]) {
		int arr2[] = new int[arr1.length];
		for(int i=arr1.length-1 ; i>=0 ; i--) {
			arr2[arr1.length-i-1] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void main(String[] args) {
		int arr1[] = {8,4,5,6,7};
		
		revArr(arr1);
	}
}
