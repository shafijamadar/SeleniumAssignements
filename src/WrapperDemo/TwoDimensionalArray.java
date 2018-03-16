package WrapperDemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		String x[][] = new String[3][4]; 
		
		System.out.println(x.length); // This will give only number of rows i.e 3
		System.out.println(x[0].length); //// This will give only number of cloumns i.e 4
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		

		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		
		for(int rowNum=0;rowNum<x.length;rowNum++){
			for(int colNum=0;colNum<x[0].length;colNum++){
			System.out.print(" " +x[rowNum] [1]);
		}
	}
	}
}
