package Tree;

public class LevelTraversalTree {
	
	// Root of the Binary Tree
	static Node root;

	public LevelTraversalTree() { root = null; }

	// Function to print level order traversal of tree
	public static void printLevelOrder()
	{
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printCurrentLevel(root, i);
	}
	static int height(Node root)
	{
		if (root == null)
			return 0;
		else {
			
			// Compute height of each subtree
			int lheight = height(root.left);
			int rheight = height(root.right);

			// use the larger one
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	// Print nodes at the current level
	static void printCurrentLevel(Node root, int level)
	{
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	// Driver program to test above functions
	public static void main(String args[])
	{
		//  = new LevelTraversalTree();
		LevelTraversalTree.root = new Node(1);
		LevelTraversalTree.root.left = new Node(2);
		LevelTraversalTree.root.right = new Node(3);
		LevelTraversalTree.root.left.left = new Node(4);
		LevelTraversalTree.root.left.right = new Node(5);

		System.out.println("Level order traversal of"
						+ "binary tree is ");
		LevelTraversalTree.printLevelOrder();
	}
}

class Node {
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}