package com.example.tree;

public class BalancedBT {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4,null,new TreeNode(8,new TreeNode(100), null)), new  TreeNode(5)), 
				new TreeNode(3,new TreeNode(6, new TreeNode(9,  new TreeNode(13),null), new TreeNode(10)), new TreeNode(7, new TreeNode(11), new TreeNode(12))));
		System.out.println(isBalanced(root));
	}

	private static boolean isBalanced(TreeNode root) {
		if (balancedHeight(root)>-1) return true;
		return false;
	}

	private static int balancedHeight(TreeNode root) {
		if(root==null) return 0;
		
		int leftHeight = balancedHeight(root.left);
		int rightHeight = balancedHeight(root.right);
		
		if (leftHeight == -1 || rightHeight== -1) return -1;
		
		if(Math.abs(leftHeight-rightHeight)>1) return -1;
		if (leftHeight>rightHeight) return leftHeight+1;
		return rightHeight+1;
	}
}
