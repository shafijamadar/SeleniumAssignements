package JavaPrograms;

import java.util.Date;

public class DateConvertor {

	public static void main(String[] args) {
		
		Date d= new Date();
		System.out.println(d);
		
		String a=d.toString().replace(" IST","").replace(' ','_'); //.replace(' ', '_');
		System.out.println(a);
	}

}
