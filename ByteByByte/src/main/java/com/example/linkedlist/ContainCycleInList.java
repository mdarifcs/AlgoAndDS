package com.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mohammad.arif
 * Given a linked list, determine weather or not it contains a cycle.
 */
public class ContainCycleInList {

	public static void main(String[] args) {
		Node cycleHead = createLinkedListWithCycle();
		Node head = Node.createLinkedList(new int[] {1,2,3,4});
		
		System.out.println("using set: "+hasCycleUsingSet(cycleHead));
		System.out.println("using set: "+hasCycleUsingSet(head));
		
		System.out.println("using fast pointer: "+hasCycleUsingFastPointer(cycleHead));
		System.out.println("using fast pointer: "+hasCycleUsingFastPointer(head));
	}
	
	private static boolean hasCycleUsingFastPointer(Node node) {
		if(node==null) return false;
		Node fastPointer = node.next;
		while(fastPointer!=null && fastPointer.next!=null) {
			if (node == fastPointer) return true;
			node = node.next;
			fastPointer = fastPointer.next.next;
		}
		return false;
	}

	private static boolean hasCycleUsingSet(Node node) {
		Set<Node> nodes = new HashSet<>();
		while (node!=null) {
			if (nodes.contains(node)) {
				return true;
			} else {
				nodes.add(node);
				node = node.next;
			}
		}
		return false;
	}

	public static Node createLinkedListWithCycle() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		
		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n3;
		
		return head;
	}
}
