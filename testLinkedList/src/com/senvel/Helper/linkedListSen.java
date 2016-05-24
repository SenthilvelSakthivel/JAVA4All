package com.senvel.Helper;

public class linkedListSen {
	private Node headNode;
	private int nodeCount;
	
	public linkedListSen()
	{
		headNode = new Node();
		nodeCount = 0;
	}
	public void addNode(int newnumber)
	{
		Node newNode = new Node(newnumber);
		newNode.next = null;
		if (nodeCount == 0)
		{
			headNode = newNode;
			nodeCount++;
		}
		else
		{
			Node currNode = headNode;
			while(currNode.getNext()!= null)
			{
				currNode = currNode.getNext();
			}
			currNode.setNext(newNode);
			nodeCount++;
		}
	}

	public void addNode(int newnumber, int pos)
	{
		Node newNode = new Node(newnumber);
		newNode.next = null;
		
		Node currNode = headNode;
		if (pos>0)
		{
			for(int i= 1 ; (i<pos && i<nodeCount); i++)
			{
				currNode = currNode.getNext();
			}
			newNode.setNext(currNode.getNext());
			currNode.setNext(newNode);
		}
		else
		{
			if (headNode.getNext()!=null)
			{
				newNode.setNext(headNode);
				headNode = newNode;
			}
			else
			{
				headNode=newNode;
			}
				
		}
		nodeCount++;
	}
	public boolean removeNode(int pos)
	{
		Node currNode;
		if (pos>nodeCount || pos<1)
		{
			return false;
		}
		if(pos==1)
		{
			headNode = headNode.getNext();
			nodeCount--;
			return true;
		}
		else
		{
			currNode = headNode;
		}
		for(int i=1; i<pos-1;i++)
		{
			currNode = currNode.getNext();
		}
		currNode.setNext(currNode.getNext().getNext());
		nodeCount--;
		return true;
	}

	public Object getValue(int pos)
	{
		if (pos<0 || pos>nodeCount)
		{
			return null;
		}
		Node currNode = headNode;
		for (int i=1; (i<pos&& i<nodeCount);i++)
		{;
			currNode = currNode.getNext();
		}
		return currNode.getData();
		
	}
	public int getNodeCount()
	{
		return nodeCount++;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		Node currNode = headNode;
		for(int i=0; i<nodeCount; i++)
		{
			sb.append(currNode.getData() + "-");
			currNode = currNode.getNext();
		}
		return sb.toString();
	}
}
