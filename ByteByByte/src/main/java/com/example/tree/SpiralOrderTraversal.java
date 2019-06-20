package com.example.tree;

import java.util.Stack;

public class SpiralOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(10), new TreeNode(11)), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		spiralOrderTraversal(root);
	}
	
	private static void spiralOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> left = new Stack<>();
		Stack<TreeNode> right = new Stack<>();

		left.add(root);

		while (!right.isEmpty() || !left.isEmpty()) {
			while (right!=null && !right.isEmpty()) {
				TreeNode node = right.pop();
				if (node!=null)	System.out.print(node.data + " ");
				if (node.right!=null) left.add(node.right);
				if (node.left!=null) left.add(node.left);
			}

			while (left != null && !left.isEmpty()) {
				TreeNode node = left.pop();
				if (node!=null) System.out.print(node.data + " ");
				if (node.left!=null) right.add(node.left);
				if (node.right!=null) right.add(node.right);
			}
		}
	}

}
