package Hackers;

import java.util.Scanner;
/*
 * https://www.hackerrank.com/challenges/java-regex/problem
 * Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
 * Valid IP's	
 * 000.12.12.034
	121.234.12.12
	23.45.12.56
	
	Invalid IP's
	000.12.234.23.23
	666.666.23.23
	.213.123.23.32
	23.45.22.32.
	I.Am.not.an.ip
 */
		
public class Regex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()){
			String IP = in.next();
			new MyRegx();
			System.out.println(IP.matches(MyRegx.pattern));
			System.out.println(MyRegx.pattern);
		}
	}
}

class MyRegx{

	static String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+
									"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
									"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	}

