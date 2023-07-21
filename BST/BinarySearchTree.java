package BST;

public class BinarySearchTree {

    public static void main(String[] args) {
        Node x = new Node(10);
        System.out.println(search(x, 10));
    }

    static boolean search(Node root, int x) {
        // Your code here

        while (root != null) {

            if (x > root.data) {
                root = root.right;
            } else if (x < root.data) {
                root = root.left;
            }

            else {
                return true;
            }
        }

        return false;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}