package Hackers;

import java.util.Arrays;
/*
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once. 
 * E.g - Listen --> Silent
 * */
 
public class Anagrams {

	public static void main(String[] args) {
		
		String A = "Listen";
		String B = "Silent";
		boolean anagram = isAnagram(A, B);
		System.out.println(anagram);
	}
	
	public static boolean isAnagram(String A, String B){
		
		if(A.length() != B.length()){
			return false;
		}
		
		boolean Anagram = true;
				
		A=A.toLowerCase();
		B=B.toLowerCase();
		
		char [] a = A.toCharArray();
		char [] b = B.toCharArray();
		
		Arrays.sort(a); // Sorts the Array in ascending order hello --> ehllo
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++){	
			System.out.println(a[i] + " " + b[i]);
			if(a[i]!=b[i]){
			Anagram = false;
		}
		}
		return Anagram;
	}
}
	
