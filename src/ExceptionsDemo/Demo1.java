package ExceptionsDemo;

import java.awt.print.Printable;

public class Demo1 {

	public static void main(String [] args)
	{
		int i,j,k;
		i=8;
		j=2;
		int a[]= new int[5];
		try
		{
			for(int x=0;x<5;i++)
			{
				a[x]=x+1;
			}
			for(int y : a)
			{
				
			System.out.println(y);
			}
			
		//	System.out.println(k=i/j);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero" +e);
			//e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("max number value is 5");
		}
		
		
		
	}
}
