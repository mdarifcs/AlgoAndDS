package com.example.linkedlist;

import java.util.Stack;

public class ReverseLinkedListUsingStack {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[]{1,2,3,4,5,6,7,8,9});
		Node.printAllNodes(head);
		Node tail = reverseLinkedList(head);
		System.out.println("using stack");
		Node.printAllNodes(tail);
	}

	private static Node reverseLinkedList(Node head) {
		Node tail = null;
		Stack<Node> stack = new Stack<Node>();
		while (head!=null) {
			stack.push(new Node(head.data));
			head = head.next;
		}
		tail = stack.pop();
		Node tmpNode = tail;
		while (!stack.isEmpty()) {
			tmpNode.next = stack.pop();
 			tmpNode = tmpNode.next;
		}
		return tail;
	}

}
