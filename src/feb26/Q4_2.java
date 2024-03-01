//Question 4: Implement a method to remove duplicates from an array of integers without using any additional 
//data structures.(2)

package feb26;

public class Q4_2 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 2, 5,3};
        
        for (int i = 0; i < arr.length; i++) {
        	boolean isDup = false;
        	for(int j=i+1 ; j<arr.length ; j++) {
        		if(arr[i]==arr[j]) {
        			isDup = true;
        			break;
        		}
        	}
        	if(isDup) {
        		System.out.print(arr[i]+" ");
        	}
        }
        
    }
}
