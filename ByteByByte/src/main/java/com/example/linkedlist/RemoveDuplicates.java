package com.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mohammad.arif
 * Given an unsorted list, write a function to remove all the duplicates
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[] { 1, 2, 3, 4, 7, 2, 4, 6, 4 });
		Node.printAllNodes(head);
		removeDup(head);
		System.out.print("after removing duplicates: ");
		Node.printAllNodes(head);
	}

	private static void removeDup(Node head) {
		Set<Integer> nodes = new HashSet<Integer>();
		Node prev = null;
		while (head != null) {
			if (nodes.contains(head.data))
				prev.next = head.next;
			else {
				nodes.add(head.data);
				prev = head;
			}
			head = head.next;
		}
	}

}
