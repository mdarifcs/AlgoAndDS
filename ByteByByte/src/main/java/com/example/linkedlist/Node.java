package com.example.linkedlist;

public class Node {
	int  data;
	Node next;
	Node secondMax;
	static Node tail;
	
	public Node() {
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	public static Node createLinkedList(int arr[]) {
		if (arr.length<1) return null;
		Node head = new Node(arr[0]);
		Node tmp = head;
		for (int j = 1; j < arr.length; j++) {
			tmp.next = new Node(arr[j]);
			tmp = tmp.next;
		}
		return head;
	}
	
	public static void printAllNodes(Node head) {
		while (head!=null) {
			System.out.print(head.data+printSecondMax(head.secondMax)+" -> ");
			head = head.next;
		}
		System.out.println("NULL");
	}
	
	public static String printSecondMax(Node secondmax) {
		if (secondmax == null) return "";
		return "{"+String.valueOf(secondmax.data)+"}";
	}
}
