//Question 3: Write a program to find the largest and smallest number in an array of integers 
//without using any built-in methods like Arrays.sort().

package feb26;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			System.out.print("Enter element "+(i+1)+": ");
			arr[i] = sc.nextInt();
//			System.out.println();
		}
		
		System.out.print("Array elements: ");
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bSort(arr);
		System.out.print("Sorted array: ");
//		System.out.println(Arrays.toString(arr));
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Smallest element: "+arr[0]);
		System.out.println("Largest element: "+arr[arr.length-1]);
		
	}
	
//	sorting
	static void bSort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
	}

//	sorting
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}













