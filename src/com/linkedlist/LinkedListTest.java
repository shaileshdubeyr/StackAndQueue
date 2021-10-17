package com.linkedlist;

public class LinkedListTest {
	public INode head;
	public INode tail;
	
	public LinkedListTest() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		this.head = newNode;
		this.tail = newNode;
		if(this.head == null)
			this.head = newNode;
		else if (this.tail == null)
			this.tail = newNode;
		else {
			INode temp = this.head; 
			this.head= newNode;
			head.setNext(temp);
		}	
	}
	
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes :");
		INode temp = head;
		while(temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if(!temp.equals(tail) )myNodes.append("->");
				temp = temp.getNext();	
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);		
	}
}
