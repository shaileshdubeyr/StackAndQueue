package com.linkedlist;

public class Node<k> {
	private k data;
	private Node next;
	
	public Node(k data) {
		this.data = data;
		this.next = null; 
	}
	
	public k getData(){
		return data;
	}
	
	public void setData(k data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
