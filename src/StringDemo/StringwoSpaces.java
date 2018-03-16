package StringDemo;

public class StringwoSpaces {

	// Program to find actual length of String by ignoring the spaces 
	
	public static void main(String[] args) {
	
		String str="Hello World";
			
		int sum=0;
		// method 1 use
		String [] mystring =str.split(" ");
		System.out.println(str.replace(" ", "").length());
				
		// method 2
		// Program to split the string without split function
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
				{
					continue; 
				}
			sum++;
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		System.out.println(sum);
		
	
		StringBuilder sb = new StringBuilder(str);
		System.out.println("String Reverse with StringBuilder " +sb.reverse());
		
		String rev="";
		char []ch= str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			rev= rev+ch[i];
		}
		System.out.println("String Reverse with for loop " +rev);
	}
	
	
}