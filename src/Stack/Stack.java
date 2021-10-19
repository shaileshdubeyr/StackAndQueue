package Stack;

import com.linkedlist.LinkedListTest;
import com.linkedlist.INode;
import com.linkedlist.Node;
public class Stack {
	private final LinkedListTest myLinkedList;
	public Stack() {
		this.myLinkedList = new  LinkedListTest();
	}
	public void push(INode myNode) {	
		myLinkedList.add(myNode);
	}
	
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	public INode peak() {
		return myLinkedList.head;	
	}
	
	public INode pop() {
		return myLinkedList.pop();
		
	}
	public void enqueu(INode myNode) {
		myLinkedList.appendNodes(myNode);
		
	}
}
