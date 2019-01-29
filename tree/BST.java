package com.samp.tree;

public class BST {
	Node root;
	class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	private Node insertRec(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		
		if(data<root.data) {
			root.left = insertRec(root.left, data);
		}else if(data > root.data) {
			root.right = insertRec(root.right, data);
		}
		
		return root;
		
	}
	
	public void delete(int key) {
		root = deleteRec(root, key);
	}

	private Node deleteRec(Node root, int key) {
		if(root==null)
			return null;
		
		if(key < root.data) {
			root.left = deleteRec(root.left, key);
		} else if(key > root.data) {
			root.right = deleteRec(root.right, key);
		} else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		return root;
	}

	private int minValue(Node root) {
		int min = root.data;
		while(root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	

	public void postOrder(Node root) {
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	public void preOrder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node root) {
		
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}

	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        System.out.println("Inorder traversal of the given tree"); 
        tree.inOrder(tree.root);
        System.out.println("\nDelete 20"); 
        tree.delete(20); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.inOrder(tree.root); 
  
        System.out.println("\nDelete 30"); 
        tree.delete(30); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.inOrder(tree.root); 
  
        System.out.println("\nDelete 50"); 
        tree.delete(50); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.inOrder(tree.root); 

	}

}
