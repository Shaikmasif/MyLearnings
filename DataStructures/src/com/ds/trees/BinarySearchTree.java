package com.ds.trees;

public class BinarySearchTree {
	TreeNode root;
	
	public TreeNode insertNode(TreeNode root, int val) {
		if(root==null) {
			return new TreeNode(val);
		}
		if(val<root.val) {
			root.leftNode = insertNode(root.leftNode, val);
		}else {
			root.rightNode = insertNode(root.rightNode,val);
		}
		return root;
	}

	public void levelOrder(TreeNode root) {
		if(root==null)return;
		java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.val+" ");
			if(current.leftNode!=null)queue.add(current.leftNode);
			if(current.rightNode!=null)queue.add(current.rightNode);
		}	
	}
	
	public boolean search(TreeNode root, int key) {
		if(root==null)return false;
		if(root.val==key)return true;
		if(key<root.val) {
			return search(root.leftNode,key);
		}else {
			return search(root.rightNode,key);
		}
	}
}
