package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListMain {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAppendedShouldBeAddedToLast() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.appendNodes(mySecondNode);
		myLinkedList.appendNodes(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.appendNodes(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myFirstNode);
		myLinkedList.pop();
		System.out.println("deleting head first node");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstElementDeletedLastShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.popLastNode();
		System.out.println("deleting last node");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode);
		myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void giveElementInsertNewNodeAfterKeyNodeShouldPassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedListTest myLinkedList = new LinkedListTest();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.findNode();
		Node<Integer> newNode = new Node<>(40);
		myLinkedList.deleteInbetween(getNode, myFirstNode);
		myLinkedList.printMyNodes();
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode);
		myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void giveElementInsertNewNodeAfterKeyNodeShouldPassLinkedListResults() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(40);
		Node<Integer> myForthNode = new Node<>(70);
		LinkedListTest myLinkedList = new LinkedListTest();
		INode getNode = myLinkedList.findNode();
		myLinkedList.addByCompare(myFirstNode);
		myLinkedList.addByCompare(mySecondNode);
		myLinkedList.addByCompare(myThirdNode);
		myLinkedList.addByCompare(myForthNode);
		myLinkedList.deleteInbetween(getNode, myFirstNode);
		myLinkedList.printMyNodes();
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode);
		myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}
}
