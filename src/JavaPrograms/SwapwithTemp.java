package JavaPrograms;

public class SwapwithTemp {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		int temp;
		
		System.out.println("Before Swap value of X is : " +x + " and Y is: " +y );
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swap value of X is : " +x);
		System.out.println("After Swap value of Y is : " +y);
	}

}
