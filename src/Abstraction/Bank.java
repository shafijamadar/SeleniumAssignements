package Abstraction;

public abstract class Bank {
	
	public abstract void loan(); // abstract method  -- no method body
	
	public void credit(){
		System.out.println("This is credit method");
	}
	
	public void debit(){
		System.out.println("This is debit method");
	}
		
	


}
