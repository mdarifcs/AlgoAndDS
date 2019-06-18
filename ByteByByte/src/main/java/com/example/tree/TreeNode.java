package com.example.tree;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public static void printNode(TreeNode node) {
		if (node == null) {
			System.out.println("null");
			return;
		}
		
		System.out.println("data ==> "+node.data);
		if(node.left==null)
			System.out.println("left ==> null");
		else 
			System.out.println("left ==> "+node.left.data);
		
		if(node.right==null)
			System.out.println("right ==> null");
		else
			System.out.println("right ==> "+node.right.data);
		
		/*
		 * if (node.neighbor==null) System.out.println("neighbor ==> null"); else
		 * System.out.println("neighbor ==> "+node.neighbor);
		 */
	}
	
	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
