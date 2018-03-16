package Collection_Test;

import java.util.ArrayList;
import java.util.Iterator;
// How to store the specific user defined class object into the arraylist

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Sachin", 101, false);
		Employee e2 = new Employee("Anu", 102, true);
		Employee e3 = new Employee("Rajesh", 103, true);
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()){
			Employee emp = itr.next();
			System.out.println(emp.emp_Name);
			System.out.println(emp.emp_No);
			System.err.println(emp.is_Employed);
		}
	}
}
