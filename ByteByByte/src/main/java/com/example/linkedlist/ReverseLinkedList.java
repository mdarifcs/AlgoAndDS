package com.example.linkedlist;

/**
 * @author mohammad.arif
 * Given a linked list, write a function that reverse the existing list inplace.
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[] {1,2,3,4,5,6,7,8,9});
		System.out.print("List: ");
		Node.printAllNodes(head);
		reverse(head);
		System.out.print("reverse: ");
		Node.printAllNodes(Node.tail);

	}

	private static void reverse(Node head) {
		if(head.next == null) {
			Node.tail = head;
			return;
		}
		reverse(head.next);
		head.next.next = head;
		head.next = null;
	}

}
