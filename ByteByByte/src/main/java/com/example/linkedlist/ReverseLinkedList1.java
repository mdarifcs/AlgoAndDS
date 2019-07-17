package com.example.linkedlist;

public class ReverseLinkedList1 {
	private static Node reverseHead;
	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[]{1,2,3,4,5,6,7,8,9});
		Node.printAllNodes(head);
		System.out.println("using recursion");
		reverseListUsingRecursion(head);
		Node.printAllNodes(reverseHead);
	}

	private static void reverseListUsingRecursion(Node head) {
		if(head.next==null) {
			reverseHead = head;
			return;
		}
		reverseListUsingRecursion(head.next);
		Node curr = head;
		curr.next.next = curr;
		curr.next = null;
	}

}
