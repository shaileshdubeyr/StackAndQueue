package Stack;

import com.linkedlist.INode;
import com.linkedlist.Node;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumberWhenAddedToStackshouldHaveLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Stack myStack = new Stack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

}
