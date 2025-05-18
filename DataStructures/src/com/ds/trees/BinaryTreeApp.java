package com.ds.trees;

public class BinaryTreeApp {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(10);
		tree.root.leftNode = new TreeNode(20);
		tree.root.rightNode = new TreeNode(30);
		tree.root.leftNode.leftNode= new TreeNode(40);
		tree.root.leftNode.rightNode = new TreeNode(50);
		tree.root.rightNode.leftNode = new TreeNode(60);
		tree.root.rightNode.rightNode = new TreeNode(70);
		
		System.out.print("In order : ");
		tree.inOrder(tree.root);
		System.out.println();
		
		System.out.println("Pre Order : ");
		tree.preOrder(tree.root);
		System.out.println();
		
		System.out.println("Post Order : ");
		tree.postOrder(tree.root);
		System.out.println();
	}

}
