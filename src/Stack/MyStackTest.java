package Stack;

import com.linkedlist.INode;
import com.linkedlist.Node;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3NumberInStackWhenPopedShouldMatchWithLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		Stack myStack = new Stack();
		myStack.enqueu(myFirstNode);
		myStack.enqueu(mySecondNode);
		myStack.enqueu(myThirdNode);
		INode peak = myStack.peak();
		INode deQueu = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myFirstNode, peak);
	}

}
