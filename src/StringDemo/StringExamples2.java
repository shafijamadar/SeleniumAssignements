package StringDemo;

/*
 Program to find occurance of M in below String
 */
public class StringExamples2 {

	public static void main(String[] args) {
		
		String str="mohamamad hmkl";
		
		//System.out.println(str.split("m"));
		System.out.println(str.replace(" ","").split("m").length-1);

	}
	


}

