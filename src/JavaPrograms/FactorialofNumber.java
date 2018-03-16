package JavaPrograms;

public class FactorialofNumber {

	public static void main(String[] args) {
	
		int i=1;
		int number=4;
		int fact=1;
		
		for(i=1;i<=number;i++){
			fact=fact*i;	
		}

		System.out.println("Factorial of Given number " +number+ " is " +fact);
	}

}
