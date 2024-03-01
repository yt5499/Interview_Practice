//Question 1: Write a program to find the second highest number in an ArrayList of integers.

package feb27;

import java.util.ArrayList;

public class Q5 {
//	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		
//		al.add(8);
//		al.add(5);
//		al.add(9);
//		al.add(4);
//		
//		System.out.println(al);
//		
//		al.sort(null);
//		
//		System.out.println(al);
//		
//		System.out.println("Second highest: "+al.get(al.size()-2));
//	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(8);
		al.add(5);
		al.add(9);
		al.add(4);
		
		System.out.println(al);
		
		for(int i=0 ; i<al.size() ; i++) {
			for(int j=i+1 ; j<al.size() ; j++) {
				if(al.get(i)>al.get(j)) {
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		
		System.out.println("Sorted list: "+al);
	}
}



















