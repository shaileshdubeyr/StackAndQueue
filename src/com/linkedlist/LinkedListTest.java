package com.linkedlist;

import java.util.Scanner;

public class LinkedListTest {
	public INode head;
	public INode tail;

	public LinkedListTest() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void appendNodes(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;	
	}
	
	public INode popLastNode() {
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		 head.getNext().setNext(null);
		return tempNode;
	}
	public INode findNode() {
		System.out.println("enter the key to search node");
		Scanner sc = new Scanner(System.in);
		int searchValue  = sc.nextInt();
		INode tempNode = head;
		while(!tempNode.getKey().equals(searchValue) ) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	} 
}
