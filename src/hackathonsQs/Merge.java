package hackathonsQs;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int arr1[] = {0,1,2,3,4};
		int arr2[] = {5,6,7,8,9};
		
		int arrC[] = new int[(arr1.length+arr2.length)];
		
		for(int i=0 ; i<arr1.length ; i++) {
			arrC[i] = arr1[i];
		}
		
		for(int i=arr1.length ; i<arrC.length ; i++) {
			arrC[i] = arr2[i-arr2.length];
		}
		
		System.out.println("Array 1: "+Arrays.toString(arr1));
		System.out.println("Array 2: "+Arrays.toString(arr2));
		System.out.println("Array 1 + 2: "+Arrays.toString(arrC));
	}
}
