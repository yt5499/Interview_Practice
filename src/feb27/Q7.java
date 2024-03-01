//Question 3: Implement a method that takes a Map<String, Integer> and returns a new Map<Integer, List<String>> 
//	where the keys are the values from the original map, and the values are lists of keys from the original map 
//	that had the same value.

package feb27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q7 {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		
		hmap.put("Yash", 1);
		hmap.put("Rajan", 2);
		hmap.put("Ramchandra", 3);
//		hmap.put("Yash", 4);
		
		System.out.println(hmap);
		
		for(int i=0 ; i<hmap.size() ; i++) {
			String key = (String) hmap.keySet().toArray()[i];
			Integer value = (Integer) hmap.values().toArray()[i];
			
			hmap2.put(value, key);
		}
		
		System.out.println("After interchanging");
		System.out.println(hmap2);
		System.out.println(hmap2.keySet());
		
	}
}
