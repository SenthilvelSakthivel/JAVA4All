package org.Java4All.LinkedList;

public class Node {
	Node next;
	int Data;
	
	public Node()
	{
		this.next = null;
	}
	public Node(int newnumber)
	{
		this.Data = newnumber;
		this.next = null;
	}
	public Node(int newnumber, Node nextvalue)
	{
		this.Data = newnumber;
		this.next = nextvalue;
	}
	public int getData()
	{
		return this.Data;
	}
	public void setData(int newnumber)
	{
		this.Data = newnumber;
	}
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node nextnode)
	{
		this.next = nextnode;
	}
}
