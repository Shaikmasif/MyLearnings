package com.ds.trees;

import com.ds.linkedlists.LinkedList;

public class BinarySearchTreeApp {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int[] values = {4,7,1,9,4,84,24,856,3,0};
		for(int val : values) {
			bst.root = bst.insertNode(bst.root, val);
		}
		
		System.out.println("Elements : ");
		bst.levelOrder(bst.root);
		
		System.out.println("856"+bst.search(bst.root, 856));
		
	}

}
