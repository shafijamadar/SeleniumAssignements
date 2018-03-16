package JavaPrograms;

public class SwappingWithoutTemp {

	public static void main(String[] args) {


		int x=40;
		int y=80;
		
		System.out.println("Values of X and Y before swapping are " +x+ " " +y);
		
		System.out.println(x=x+y);
		System.out.println(y=x-y);
		System.out.println(x=x-y);
		
		System.out.println("Values of X and Y after swapping are " +x+ " " +y);

	}

}
