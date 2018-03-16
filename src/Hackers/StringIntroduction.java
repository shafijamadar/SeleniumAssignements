package Hackers;
/*
 *  Find sum of length of A +B
 * Determine if A is lexicographically larger than B
 * Convert First letter of a string to Capital
*/

public class StringIntroduction {

	public static void main(String[] args) {
		
		String A = "java";
		String B = "hello";
		int sum= A.length()+B.length();
		
		// Find sum of length of A +B
		System.out.println("Sum of length of String A and String B is " + sum);
		
		// Determine if A is lexicographically larger than B
		
		boolean greater = false;
		int i =A.compareTo(B);
		if(i>0){
			greater=true;
		}
			else{ 
				greater=false;
		}
		System.out.println(greater);
		// Convert First letter of a string to Capital
		A = A.substring(0, 1).toUpperCase() + A.substring(1);
		System.out.println(A);
		
		B = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
		System.out.println(B);
		
		
	}

}
