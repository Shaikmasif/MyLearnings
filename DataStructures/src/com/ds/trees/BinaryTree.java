package com.ds.trees;

public class BinaryTree {
	
	TreeNode root;
	
	public void inOrder(TreeNode root) {
		if(root==null)
			return;
		inOrder(root.leftNode);
		System.out.print(root.val+" ");
		inOrder(root.rightNode);
	}
	public void preOrder(TreeNode root) {
		if(root==null)return;
		System.out.print(root.val+" ");
		preOrder(root.leftNode);
		preOrder(root.rightNode);
		
	}
	public void postOrder(TreeNode root) {
		if(root==null)return;
		postOrder(root.leftNode);
		postOrder(root.rightNode);
		System.out.print(root.val+" ");
	}
	

}
