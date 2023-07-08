package Tree;

import java.util.Scanner;

// import Node;

public class DiameterBinaryTree {
	
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

    static int Diameter(Node root){
        if (root == null) return 0;

        int dl = Diameter(root.left);
        int dr = Diameter(root.right);
        int curr = HeightTree(root.left) + HeightTree(root.right)+1;
        return Math.max(Math.max(dl, dr), curr);
    }

    static int HeightTree(Node root){
        if (root == null) return 0;
        return Math.max(HeightTree(root.left), HeightTree(root.right))+1;

    }
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}