package com.example.tree;

import java.util.Stack;

public class SpiralOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,
				new TreeNode(2, new TreeNode(4, new TreeNode(10), new TreeNode(11)), new TreeNode(5)),
				new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		spiralOrderTraversal(root);
		System.out.println("\nrecursive: ");
		spiralOrderTraversalRecursive(root);
	}

	private static void spiralOrderTraversalRecursive(TreeNode root) {
		int height = getHeight(root);
		System.out.println("height: " + height);
		boolean flag = true;
		for (int i = 1; i <= height; i++) {
			spiralOrderRecursive(root, i, flag);
			flag = !flag;
		}
	}

	private static void spiralOrderRecursive(TreeNode root, int i, boolean flag) {
		if (root == null)
			return;
		if (i == 1) {
			System.out.print(root.data + " ");
			return;
		}
		if (flag) {
			spiralOrderRecursive(root.left, i - 1, flag);
			spiralOrderRecursive(root.right, i - 1, flag);
		} else {
			spiralOrderRecursive(root.right, i - 1, flag);
			spiralOrderRecursive(root.left, i - 1, flag);
		}
	}

	private static int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = getHeight(root.left) + 1;
		int rightHeight = getHeight(root.right) + 1;
		return Integer.max(leftHeight, rightHeight);
	}

	private static void spiralOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> left = new Stack<>();
		Stack<TreeNode> right = new Stack<>();

		left.add(root);

		while (!right.isEmpty() || !left.isEmpty()) {
			while (right != null && !right.isEmpty()) {
				TreeNode node = right.pop();
				if (node != null)
					System.out.print(node.data + " ");
				if (node.right != null)
					left.add(node.right);
				if (node.left != null)
					left.add(node.left);
			}

			while (left != null && !left.isEmpty()) {
				TreeNode node = left.pop();
				if (node != null)
					System.out.print(node.data + " ");
				if (node.left != null)
					right.add(node.left);
				if (node.right != null)
					right.add(node.right);
			}
		}
	}

}
