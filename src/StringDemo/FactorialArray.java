package StringDemo;

public class FactorialArray {

	public static void main(String[] args) {
	
	// factorial of single number
		int number=5;
		int n;
		int factorial=1;
			
		for(n=1;n<=number;n++)
		{
			factorial=factorial*n;
		}
		System.out.println(factorial);
		
		
	// factorial of an array
		String a[]={"5","4"};
		int count = 0;
		int total=0;
		
											
		for(int i=1;i<=a.length;i++)
		{		
			
			System.out.println("Value of a is "+i);
			for(int j=i+1;j<i;j++)
				{
					factorial=factorial*j;				
				}
		
			System.out.println("factorial of array are " +factorial);
		}
		
}
}
