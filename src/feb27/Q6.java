//Question 2: Write a method to remove all duplicates from an ArrayList.

package feb27;

import java.util.ArrayList;

public class Q6 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(8);
		al.add(5);
		al.add(8);
		al.add(9);
		al.add(4);
		al.add(4);
		
		System.out.println("Original list: "+al);
		
		System.out.println("List after removing duplicates: "+removeDups(al));
	}
	
//	method to remove duplicates
	static ArrayList<Integer> removeDups(ArrayList<Integer> al) {
		for(int i=0 ; i<al.size() ; i++) {
			for(int j=i+1 ; j<al.size() ; j++) {
				if(al.get(i)==al.get(j)) {
					al.remove(j);
				}
			}
		}
		return al;
	}
}
