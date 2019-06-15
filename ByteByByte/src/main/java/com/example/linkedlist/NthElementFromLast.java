package com.example.linkedlist;

import java.util.Scanner;

public class NthElementFromLast {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[]{});
		Node.printAllNodes(head);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n>0) {
			System.out.println(printNthElementFromLast(head,n));
			n = scan.nextInt();
		}
		
	}

	private static int printNthElementFromLast(Node head, int n) {
		Node follower = head;
		for (int i = 0; i < n; i++) {
			if (head == null) return -1;
			head = head.next;
		}
		
		while (head!=null) {
			head = head.next;
			follower = follower.next;
		}
		
		return follower.data;
	}

}
