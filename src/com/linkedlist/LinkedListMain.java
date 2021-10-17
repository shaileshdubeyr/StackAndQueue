package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {		
		Node<Integer> nodeOne = new Node<Integer>(70);
		Node<Integer> nodeTwo = new Node<Integer>(30);
		Node<Integer> nodeThree = new Node<Integer>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(nodeOne);
		myLinkedList.add(nodeTwo);
		myLinkedList.add(nodeThree);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(nodeThree)&&
						 myLinkedList.head.getNext().equals(nodeTwo)&&
						 myLinkedList.tail.equals(nodeOne);
		Assert.assertTrue(result);	

		
	}
}
