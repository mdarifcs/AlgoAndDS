package com.example.linkedlist;

import java.util.Stack;

/**
 * @author mohammad.arif Given a linked list, write a function to determine
 *         weather the list is palindrom or not.
 *         case 1: 1 -> 2 -> 3 -> 2 -> 1 -> null
 *         case 2: 1 -> 2 -> 3 -> 3 -> 2 -> 1 -> null
 *
 */
public class PalindromeCheck {

	public static void main(String[] args) {
		Node head = Node.createLinkedList(new int[] {1,2});
		System.out.println(checkPalindrome(head));
	}

	private static boolean checkPalindrome(Node head) {
		if (head==null) throw new NullPointerException("No element present in list");
		if (head.next==null) return true;
		Stack<Integer> stack = new Stack<>();
		Node fast = head.next;
		while (fast!=null && fast.next!=null) {
			stack.push(head.data);
			head = head.next;
			fast = fast.next.next;
		}
		if (fast!=null) stack.push(head.data);//even case
		head = head.next;
		while(head!=null) {
			if (head.data!=stack.pop()) return false;
			head = head.next;
		}
		return true;
	}

}
