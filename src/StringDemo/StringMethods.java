package StringDemo;

public class StringMethods {
	
	public static void main(String [] args){
		
		String str = "Parctise for all Methods";
		
		String a = "Hello";
		String b = "Java";
		String c = new String("java");
		String d = "Hello";
		
		System.out.println(a.equals(b)); //false
		System.out.println(c.equalsIgnoreCase(b)); // true
		System.out.println(a==d); // true
		
		System.out.println(str.compareTo(b)); // 6
		System.out.println(b.compareTo(c)); // -32
		System.out.println(a.compareTo(d)); // 0
		System.out.println(a.compareTo(b)); // -2
		
		System.out.println(str.substring(5)); // ise for all Methods
		System.out.println(str.substring(0, 7)); // Parctis
		System.out.println(str.subSequence(2, 5)); // rct
	
		System.out.println(str.toLowerCase()); // parctise for all methods
		System.out.println(c.toUpperCase()); // JAVA
		
		System.out.println(str.charAt(5)); // i
		
		System.out.println(str.concat("of Java")); // Parctise for all Methodsof Java
		
		System.out.println(str.contains("for")); //true
	
		String e = a.intern(); 
		System.out.println(e); // Hello
		
		System.out.println(a==e); // true
		
		System.out.println(str.startsWith("for")); // false
		System.out.println(str.startsWith("Par")); // true
		
		System.out.println(str.endsWith("ods")); // true
		System.out.println(str.endsWith("Java")); // false
		
		
		char [] ch = str.toCharArray();
		for(int i=0; i< ch.length;i++){
			System.out.print(ch[i]);
		} // Parctise for all Methods
		
		
		System.out.println("Replace all " +str.replaceAll("a", "z")); //for all MethodsReplace all Pzrctise for zll Methods
		System.out.println("Replace " +str.replace("ll", "zoom")); //Parctise for azoom Methods
		
		String [] words = str.split(" ");
		for(String word : words){
			System.out.println(word);
		}
		
		String [] w = str.split("for", 15);
		for(String wa : w){
			System.out.println(wa);
		}
	}
}
