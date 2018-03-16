package Collection_Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		/*
		 * Key Value pair - Each Key and value is known as entry. Contains only unique elements
		 */

	//	Map<String, String> map = new HashMap<String, String>();
		
		/* 	HashMap
		 *  HashMap contains values based on the key
		 *  It contains only unique elements
		 *  It may have one null key and multiple null values
		 *  It maintains no order
		 */
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		/*
		 * Contains values based on key
		 * It contains only unique elements
		 * It may have null key and multiple null values
		 * 
		 */
		
		map.put("Name", "ABC");
		map.put("", "PQR");
		map.put(null, null);
		map.put("Name", "ABC");
		map.put(null, null);
		map.put("Tel", null);
		
		for(Map.Entry e : map.entrySet()){
			System.out.println(e.getKey()+ " " + e.getValue());
		}
	}

}
