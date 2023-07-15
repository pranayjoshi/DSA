package Tree;

import java.util.Scanner;

// import Node;

public class CheckAncestor {
	
	static Scanner sc = null;
    // static int counter = 0;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		createTree();
	}
	
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}

    static Node Ancestor(Node root, int n1, int n2){
        if (root == null) return null;

        if (root.data == n1 || root.data == n2){
            return root;
        }

        Node left = Ancestor(root.left, n1, n2);
        Node right = Ancestor(root.right, n1, n2);
        if (left == null) {
            return right;
        }
        if (right == null){ return left;}
        return root;
    }
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}