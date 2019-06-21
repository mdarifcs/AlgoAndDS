package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(10), new TreeNode(11)), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		System.out.println("iterative: ");
		levelOrderTraverse(root);
		System.out.println("\nrecursive: ");
		levelOrderTraverseRecursive(root);
	}

	private static void levelOrderTraverseRecursive(TreeNode root) {
		int h = getHeight(root);
		System.out.println("height: "+h);
		for (int i = 1; i <= h; i++) {
			levelOreder(root,i);
		}
	}

	private static void levelOreder(TreeNode root, int i) {
		if (root==null) return;
		if (i==1) {
			System.out.print(root.data+" ");
		}
		levelOreder(root.left, i-1);
		levelOreder(root.right, i-1);
	}

	private static int getHeight(TreeNode root) {
		if (root==null) return 0;
		int leftHeight = getHeight(root.left) + 1;
		int rightHeight = getHeight(root.right) + 1;
		return Integer.max(leftHeight, rightHeight);
	}

	private static void levelOrderTraverse(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node != null)
				System.out.print(node.data + " ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
	}

}
