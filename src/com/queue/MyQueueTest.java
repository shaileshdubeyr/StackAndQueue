package com.queue;

	import com.linkedlist.Node;
	import org.junit.Assert;
	import org.junit.Test;
	import com.linkedlist.*;

	public class MyQueueTest {
		@Test
		public void given3NumberInQueuekWhenEnquedShouldAddedAfterTheAddedNode() {
			Node<Integer> myFirstNode = new Node<>(56);
			Node<Integer> mySecondNode = new Node<>(30);
			Node<Integer> myThirdNode = new Node<>(70);
			Queue myqueue = new Queue();
			myqueue.enqueu(myFirstNode);
			myqueue.enqueu(mySecondNode);
			myqueue.enqueu(myThirdNode);
			INode peak = myqueue.peak();
			myqueue.printQueue();
			Assert.assertEquals(myFirstNode, peak);
		}

}
