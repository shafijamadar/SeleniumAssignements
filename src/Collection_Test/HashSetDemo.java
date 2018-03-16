package Collection_Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		/* HashSet
		 * Stores elements on the basis of hashing mechanism 
		 * Unique elements
		 */
	
		
	//	LinkedHashSet<String> set = new LinkedHashSet<>();
	
		/* LinkedHash Set
		 * Provides all the set operations 
		 * Permits null elements
		 * Maintains insertion order
		 */
		
	//	TreeSet<String> set = new TreeSet<>(); 
		
		/* TreeSet
		 * Access and retrival is quit fast
		 * Maintains ascending order
		 * No Null Elements
		 */
		
		set.add("Emp");
		set.add("Person");
		set.add(null);
		set.add(null);
		set.add("Person");
		set.add("Z");
		set.add("Ferson");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
