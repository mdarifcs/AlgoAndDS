package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(10), new TreeNode(11)), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
		levelOrderTraverse(root);
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
