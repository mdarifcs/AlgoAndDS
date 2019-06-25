package com.example.tree;

public class LongestConsecutiveBranch {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(3, null, new TreeNode(4))), new TreeNode(4, new TreeNode(7), new TreeNode(10)));
		System.out.println("consecutive length: "+consecutiveLength(root));
	}
	
	private static int consecutiveLength(TreeNode root) {
		if (root==null) return 0;
		return getMax(consecutiveLength(root.left, root.data, 1),consecutiveLength(root.right, root.data, 1));
	}
	
	private static int consecutiveLength(TreeNode root, int prev, int length) {
		if (root == null) return length;
		if (root.data == prev+1) {
			int leftHeigth = consecutiveLength(root.left,root.data,length+1);
			int rightHeight = consecutiveLength(root.right,root.data,length+1);
			return getMax(leftHeigth,rightHeight);
		} else {
			int leftHeigth = consecutiveLength(root.left,root.data,1);
			int rightHeight = consecutiveLength(root.right,root.data,1);
			return getMax(leftHeigth,rightHeight,length);
		}
		
		
	}

	private static int getMax(int... args) {
		int max = Integer.MIN_VALUE;
		for (int i : args) {
			if (i>max)
				max = i;
		}
		return max;
	}

	

}
