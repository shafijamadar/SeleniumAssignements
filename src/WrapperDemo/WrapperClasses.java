package WrapperDemo;

public class WrapperClasses {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20); // 10020

		// Data conversation from String to int
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+20); // 120.
		
		String y = "12.33";
		System.out.println(y+9.6); //12.339.6
		double t = Double.parseDouble(y); 
		System.out.println(t+9.6); // 21.93
		
		// String to boolean
		
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// integer to String
		
		int j = 200;
		System.out.println(200+20); // 220
		
		String s = String.valueOf(j);
		System.out.println(s+20); //20020

		// double to String
		double aa = 13.56;
		String bb = String.valueOf(aa);
		
		System.out.println(bb+6.9); //13.566.9
		
		// String 
		
		String u= "100A";
		
		int jj = Integer.parseInt(u); // The format of the number exception
		System.out.println(jj);
		
		
	}

}
