package com.example.tree;

public class CheckBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6, new TreeNode(5), new TreeNode(7)));
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));		
	}

	private static boolean isBST(TreeNode root, int minValue, int maxValue) {
		if(root == null) return true;
		if(root.data<minValue || root.data>maxValue) return false;
		boolean leftFlag = isBST(root.left, minValue, root.data);
		boolean rightFlag = isBST(root.right, root.data+1, maxValue);
		return leftFlag && rightFlag;
	}

}
