package hackathonsQs;

import java.util.Arrays;
import java.util.Scanner;

public class ContentAtoB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			System.out.print("Enter element at "+(i+1)+" location: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array 1: "+Arrays.toString(arr1));
		
		int arr2[] = new int[size];
		for(int i=0 ; i<size ; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("Copy of array 1: "+Arrays.toString(arr2));
	}
}
