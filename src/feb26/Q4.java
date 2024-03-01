//Question 4: Implement a method to remove duplicates from an array of integers without using any additional 
//data structures.

package feb26;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
	static List<Integer> removeDup(int[] arr) {
		int len = arr.length;
		
//		list for storing final result.
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0 ; i<len ; i++) {
//			if(arr[i]!=arr[i+1]) {
//				
//			}
			if(result.contains(arr[i])) {
				continue;
			}else {
				result.add(arr[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,1,2,1,3,2,5};
		
		System.out.println(removeDup(arr));
	}
}