package com.example.linkedlist;

/**
 * @author mohammad.arif Given a linked list, write a function that devides it
 *         into two halves. this function should modify the orignal list and
 *         than return a pointer to the second half of the list.
 */
public class DivideLinkedListInTwoHalves {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[] {1,2,3,4,5,6});
		System.out.print("LinkedList: ");
		Node.printAllNodes(head);
		Node secondHalves = splitLinkedList(head);
		System.out.print("firstHalve: ");
		Node.printAllNodes(head);
		System.out.print("secondHalve: ");
		Node.printAllNodes(secondHalves);
	}

	private static Node splitLinkedList(Node head) {
		if (head == null) return null;
		Node seconHalves = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			seconHalves = seconHalves.next;
			fast = fast.next.next;
		}
		Node retNode = seconHalves.next;
		seconHalves.next = null;
		return retNode;
	}

}
