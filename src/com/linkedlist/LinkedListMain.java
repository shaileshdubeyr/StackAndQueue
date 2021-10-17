package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {
	@Test
	public void giben3NumbersWhenLinkedShouldPasslinkedListTest() {		
		Node<Integer> nodeOne = new Node<Integer>(50);
		Node<Integer> nodeTwo = new Node<Integer>(30);
		Node<Integer> nodeThree = new Node<Integer>(70);
		nodeOne.setNext(nodeTwo);
		nodeTwo.setNext(nodeThree);
		boolean result = nodeOne.getNext().equals(nodeTwo)&&
						 nodeTwo.getNext().equals(nodeThree);		
		Assert.assertTrue(result);	
	}
}
