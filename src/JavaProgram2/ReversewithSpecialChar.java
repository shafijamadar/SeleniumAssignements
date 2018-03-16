package JavaProgram2;

public class ReversewithSpecialChar {

	public static void main(String[] args) {
		
		String A = "madam";//"India // is # very beautiful & People @ maharshtra are awesome";

		char [] ch = A.toCharArray();
		String rev = "";
		for(int i = ch.length-1;i>=0;i--){
			rev = rev + ch[i];
			
		}
		System.out.print(rev);
	}
	
}
