package amazon.sofa.practice;

import java.util.Queue;

public class BinaryTree {
	Node root;
	public void addNode(String name, int key) {
		Node newNode = new Node(name, key);
		if (root == null) {
			root = newNode;		
		} else {
			Node focusNode = root;
			Node parent;
			//
			while (true) {
				parent = focusNode;
				if (key <= focusNode.key) {
					focusNode = focusNode.left;
					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			
			}
		}
	}
	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.left);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.right);
		}
	}
	 public Node findNode(int key) { 
		 Node focusNode = root;
		 while (focusNode.key != key) {
			  if (key < focusNode.key) {
				  focusNode = focusNode.left;
			  } else {
				  focusNode = focusNode.right;
			  }
			  if (focusNode == null)
				  return null;

		 }
        return focusNode;

	 }
	 public void remove(int key) {
		 Node focusNode = root;
		 Node parent = root;
		 
	 }
	
	 public static void main(String[] args) {  
		 BinaryTree bt = new BinaryTree();
		 bt.addNode("sofani", 50);
		 bt.addNode("sofani", 90);
		 bt.addNode("sofani", 40);
		 bt.addNode("sofani", 100);
		 bt.addNode("sofani", 50);
		 bt.inOrderTraverseTree(bt.root);
	 }
	
}


class Node {
    int key;
	String name;
	Node left;
	Node right;
	Node (String name, int key) {
		this.name = name;
		this.key = key;
	}
	public String toString() {
		return name +" has " + key;
	}
	
}