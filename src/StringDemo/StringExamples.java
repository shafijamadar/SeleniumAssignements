package StringDemo;


public class StringExamples {

	public static void main(String [] args){
		
		A a=new B(); // Reference variable to parent class refers to object of child class
		
	//	a.print();
		
		A b1 = new C();
		b1.print();
				
	}
}

class A
{
	public void print()
	{
		System.out.println("Printer is of HP");
	}
}

class B extends A
{
	public void print(){
		System.out.println("Print this page");
	}
}

class C extends B
{
	public void print(){
		System.out.println("Its colored printer");
	}
}

// Static Binding - When a type of object is determined at the compile time.
// If there is private, final and static method in a class its called static binding.

// Dynamic Binding - When a type of object is determined at runtime time
