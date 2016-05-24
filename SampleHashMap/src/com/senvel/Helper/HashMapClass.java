package com.senvel.Helper;
import java.util.HashMap;


public class HashMapClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> emp = new HashMap<Integer,String>();
		emp.put(Integer.valueOf(138513),"Senthilvel");
		emp.put(138758,"Vimala");
		
		System.out.println(emp);
		
		emp.put(138245,"John");
		emp.put(138528,"Senthil PL");
		System.out.println(emp);
		if (emp.containsKey(138513))
		{
			System.out.println(emp.get(138513));
		}
		if (emp.isEmpty()) System.out.println("List is empty");
		
	}

}
