package JavaProgram2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindString {

	public static void main(String[] args) {
		
		String sentence="After India ismy country, India is democratic nation, India is great";
			
		System.out.println("Method 1");	
		int i = sentence.split("India").length-1;
		System.out.println("i is " +i);
		
		System.out.println("Method 2");	
		String c=sentence.replace("India", "0");
		System.out.println(c);
		
		String[] b=sentence.split("India");
	
		System.out.println(b.length-1);
		
		getText(sentence, "India");
		getText(sentence,"India", 2);
	
	}
	
	public static void getText(String sentence, String text){
	
		System.out.println("Method 3");
		
		int count=0;
		
		List<String> list = Arrays.asList(sentence.split(" "));
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			
			String abc = itr.next();
			if(abc.equals(text)){
				System.out.println(text);
				count++;
			}
				
		}
		System.out.println(count);
		/*for(String str : list)
		{	
			System.out.println("String is " +str.contains(text));
			
			boolean found = list.contains(text);
			if(found)
			{
				count++;
				System.out.println(found);		
			}	
		}
		System.out.println(count);
		*/
	}

	
	public static void getText(String sentence, String text, int n){
		
		System.out.println("Method 4");		
		int count=0;
		Pattern pattern = Pattern.compile(text); 
		
		Matcher matcher = pattern.matcher(sentence);
		boolean found = false;
		while(matcher.find()){
			found = true;
			count++;
		}
		System.out.println(count);
	
		if(count==n){
			System.out.println("occurance of word is equal");
		}
}	
}