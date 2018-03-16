package Collection_Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSort {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		/*
		 * Contains duplicate elements
		 * Maintains insertion order
		 * Non synchronized
		 * Manipulation is fast as no shifting needs to be occured
		 * 
		 */
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(7);
		
		System.out.println("Linked list before sorting");
		for(int i : list){
			System.out.println(i);
		}		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("Max number is " +list.get(0));
		
	}

}
