package com.stack;

import com.linkedlist.Node;
import org.junit.Assert;
import org.junit.Test;
import com.linkedlist.*;

public class MyStackTest {
	@Test
	public void given3NumberInStackWhenPopedShouldMatchWithLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Stack myStack = new Stack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, pop);
	}
}
