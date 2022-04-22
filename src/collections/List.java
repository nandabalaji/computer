package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List {
	
	public static void main(String[] args) {
		
	ArrayList l1 =new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		int size = l1.size();
		System.out.println(size);
		
		Object a = l1.get(1);
		System.out.println(a);
		
		Object object = l1.get(4);
		System.out.println(object);
		
		l1.remove(3);
		System.out.println(l1);
		
		l1.add(2,100);
		System.out.println(l1);
		
		l1.set(3, 101);
		System.out.println(l1);
		Integer Integer = (java.lang.Integer) l1.get(1);
		System.out.println(Integer);
		for (int i = 1; i <l1.size(); i++) {
			Integer Integer1 = (java.lang.Integer) l1.get(i);
			System.out.println(Integer1);
	     }
		LinkedList<Integer> l2 = new LinkedList<Integer>();
	     l2.addAll(l1);
	     System.out.println(l2);
	     boolean equals = l1.equals(l2);
	     System.out.println(equals);
	     
		
		
		
		
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
