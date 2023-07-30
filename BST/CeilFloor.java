package BST;

public class CeilFloor {
    public static void main(String[] args) {
        Node x = new Node(10);
        System.out.println(Ceil(x, 10));
        System.out.println(Floor(x, 10));
    }

    static Integer Ceil(Node root, int Key) {
        // your code here
        int ans = Integer.MAX_VALUE;
        if (root.data == Key) {
            return root.data;
        }
        while (root != null) {

            if (root.data > Key) {
                root = root.left;
            } else {
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}