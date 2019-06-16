package com.example.linkedlist;

/**
 * @author mohammad.arif
 * Given a linked list, write a function that prints the node of the list in reverse order.
 *
 */
public class PrintReversedList {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		printReversed(head);

	}

	private static void printReversed(Node head) {
		if (head == null)
			return;
		printReversed(head.next);
		System.out.print(head.data + " ");
	}

}
