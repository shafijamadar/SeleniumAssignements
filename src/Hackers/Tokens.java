package Hackers;

import java.util.Arrays;

public class Tokens {

	// Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
	public static void main(String[] args) {
		
		String A = "He is a very very good boy, isn't he?";
				
		String [] words = A.replaceAll("[^A-Za-z]+", " ").trim().split("\\s");
		
		System.out.println(words.length);
		
		for(String w : words){
			System.out.println(w);
		}
	}
}
