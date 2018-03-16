package JavaPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
	
		int n=153;
		int temp,a;
		int c=0;
				
		temp=n;
		
		while(n>0)
		{
		a=n%10;
		n=n%10;
		
		c=c+(a*a*a);
		}
		
		if(temp==c)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}

}
