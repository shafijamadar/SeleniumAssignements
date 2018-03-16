package DemoCollection;

import java.util.Hashtable;
import java.util.Map;

// If there are two sets of key and value pair print the values only if key and values are same

public class TwoValues {

	public static void main(String[] args) {

			Hashtable<String, String> table1 = new Hashtable<>();
			table1.put("Sachin", "786546546");
			table1.put("Raj", "8888888888");
			table1.put("Aman", "6456645400");
			
			Hashtable<String, String> table2 = new Hashtable<>();
			table2.put("Sachin", "786546546");
			table2.put("Raj", "8888888888");
			table2.put("Rishi", "1231311232");
			
			for(Map.Entry<String, String> entry1 : table1.entrySet()){
				for(Map.Entry<String, String> entry2 : table2.entrySet())
				if(entry1.getValue()==entry2.getValue()){
					System.out.println(entry2.getKey() + " " +entry2.getValue());
				}
			}
			}
}


