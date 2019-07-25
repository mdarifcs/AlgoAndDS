package com.example.linkedlist;

/**
 * @author mohammad.arif
 * Given a linked list where each node has two pointers,
 * one to the next node and one to a random node in the list,
 * write a function to clone the linked list.
 * 1 -> 2 -> 3 -> 4 -> null
 * v    v    v    v
 * 3    1    3    2
 */
public class RandomLinkedList {

	public static void main(String[] args) {
		Node head = createRandomList();
		Node.printAllNodes(head);
		Node copy = cloneList(head);
		System.out.print("original: ");
		Node.printAllNodes(head);
		System.out.print("copy: ");
		Node.printAllNodes(copy);
	}
	
	private static Node cloneList(Node head) {
		if (head == null) return null;
		
		//this method will list of double size with duplicates nodes
		addDuplicatesNode(head);
		
		//this method will add random nodes to duplicates nodes
		addRandomNodesToDuplicateNodes(head);
		
		//this method will separate duplicate nodes in and return head of clone
		return seperateDuplicateNodes(head);
	}

	private static Node seperateDuplicateNodes(Node head) {
		Node odd = head;
		Node even = head.next;
		Node retNode = head.next;
		while(odd!=null && even!=null) {
			odd.next = even.next;
			odd = even.next;
			
			if (odd == null) {
				even = null;
				break;
			}
			even.next = odd.next;
			even = odd.next;
		}
		
		return retNode;
	}

	private static void addRandomNodesToDuplicateNodes(Node head) {
		Node node = head;
		while(node!=null) {
			node.next.secondMax = node.secondMax.next;
			node = node.next.next;
		}
		
	}

	private static void addDuplicatesNode(Node head) {
		Node node = head;
		while(node!=null) {
			Node tmp = new Node(node.data);
			tmp.mark = true;
			tmp.next = node.next;
			node.next = tmp;
			node = node.next.next;
		}
		
	}

	private static Node createRandomList() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		
		Node head = n1;
		n1.next = n2;
		n1.secondMax = n3;
		n2.next = n3;
		n2.secondMax = n1;
		n3.next = n4;
		n3.secondMax = n3;
		n4.secondMax = n2;
		n4.next = null;
		
		return head;
	}

}
