package Singleton;

public class SingletonDemo {

/*
 * In OOPs Singleton class is a class that can have only one object, At a time we can create single instance of the class
 * How to design Singleton class
 * 1. Make constructor as private
 * 2. Write a static method that return type object of this singleton class (Lazy initialization)
 * 
 * Q. Difference between Normal class and Singleton class
 * In normal class constructor is used to instantiate to create the object whereas in Singleton Class we use get instance method
 */
	
	private static SingletonDemo singleton_instance = null;
	public String str;
	
	private SingletonDemo(){
		str = "Hello World";
	}
	
	public static SingletonDemo getInstance(){
		if(singleton_instance == null)
			singleton_instance = new SingletonDemo();
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		
		SingletonDemo x = SingletonDemo.getInstance();
		SingletonDemo y = SingletonDemo.getInstance();
		SingletonDemo z = SingletonDemo.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
