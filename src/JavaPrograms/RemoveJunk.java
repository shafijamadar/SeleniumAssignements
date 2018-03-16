package JavaPrograms;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "了几刀 latin string 0123456789";
		String s1= "&^%&%^&&%### JAVA )()*)*)? &&&& String";
		
		// Regular Expression [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		s1 = s1.replaceAll("[^a-zA-Z0-9]", "_");
		
		System.out.println(s1);
	}
}
/* Output is
latinstring0123456789
_____________JAVA_______________String
*/