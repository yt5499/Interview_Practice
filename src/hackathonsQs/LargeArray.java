package hackathonsQs;

import java.util.Scanner;

public class LargeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements in array");
		
		for(int i=0 ; i<size ; i++) {
			System.out.print("Enter element at "+(i+1)+" location: ");
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=1 ; i<size ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
//		printing array
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
//		printing max number
		System.out.println("Maximum is: "+max);
	}
}
