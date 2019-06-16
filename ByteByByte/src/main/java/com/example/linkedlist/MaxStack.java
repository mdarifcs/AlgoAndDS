package com.example.linkedlist;

/**
 * @author mohammad.arif Design a stack with a push, pop and max function which
 *         returns the max value in the stack, all of which are run in o(1)
 *         time. 
 *         1 -> 2 -> 3 -> 2 -> 1 -> null 
 *         v 	v 	 v 	  v    v 
 *         null null 2 	  1	   null
 */
public class MaxStack {

	Node head;
	Node max;
	
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			max = head;
		} else {
			newNode.next = head;
			head = newNode;
		}
		
		if (max==null || max.data<newNode.data) {
			newNode.secondMax = max;
			max = newNode;
		}
		
	}
	
	public Node pop() {
		if(head == null) throw new NullPointerException("no element found");
		Node retNode = head;
		if (head.secondMax != null) max = head.secondMax;
		head = head.next;
		retNode.next = null;
		return retNode;
	}
	
	public Node getMax() {
		return max;
	}
	
	public static void main(String[] args) {
		MaxStack stack = new MaxStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(15);
		stack.push(5);
		stack.push(100);
		stack.push(50);
		Node.printAllNodes(stack.head);
		Node.printAllNodes(stack.pop());
		Node.printAllNodes(stack.head);
		System.out.println("max: "+stack.getMax().data);
	}
	
}
