package JavaPrograms;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
	// How to find duplicate Element is Array
		String names [] = { "Java", "JavaScript", "Ruby", "C", "Java"};
		//using Hashset
		
		HashSet <String> store = new HashSet<>();
		for(String name : names){
			if(store.add(name)== false){
				System.out.println("Duplicate element is " +name);
			}
		}
	}

}
