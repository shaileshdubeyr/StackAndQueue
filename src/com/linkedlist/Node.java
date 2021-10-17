package com.linkedlist;

public class Node<K> implements INode<K> {
	private K key;
	private Node<K> next;
	
	public Node(K key) {
		this.key = key;
		this.next = null; 
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
		
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (Node<K>) next;
		
	}	
	
	
}
