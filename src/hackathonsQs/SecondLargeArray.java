package hackathonsQs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeArray {
	
//	main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("Enter element at location "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		sort(arr);
		
		System.out.println("Sorted array: "+Arrays.toString(arr));
		System.out.println("Second maximum from the array is: "+arr[size-2]);
	}
	
//	sorting
	public static void sort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=1 ; j<arr.length-i ; j++) {
				if(arr[j-1]>arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
	}
	
//	swapping
	static void swap(int arr[], int f, int s) {
			int temp = arr[f];
			arr[f] = arr[s];
			arr[s] = temp;
	}
}

