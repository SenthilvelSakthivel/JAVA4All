package com.senvel.Helper;

import com.senvel.*;

public class testLinkedList {

	public static void main(String args[])
	{
		linkedListSen ll = new linkedListSen();
		ll.addNode(9);
		System.out.println(ll.toString());
		ll.addNode(3);
		System.out.println(ll.toString());
		ll.addNode(5);
		System.out.println(ll.toString());
		ll.addNode(900, 0);
		System.out.println(ll.toString());
		ll.addNode(7);
		System.out.println(ll.toString());
		int n=5;
		if (ll.getValue(n)!=null)
		{
			System.out.println("Data in  position is " + ll.getValue(n));	
		}
		
		ll.removeNode(0);
		System.out.println("After deleting Node in Position : " + ll.toString());
		
		System.out.println("Total Number of Nodes in the list is " + ll.getNodeCount());
		
	}
}
	