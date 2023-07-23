package BST;

public class Delete {

    public static void main(String[] args) {
        Node x = new Node(10);
        System.out.println(delete(x, 10));
    }

    static int minValue(Node root) {
        int minv = root.data;
        while (root.left == null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    static Node delete(Node root, int Key) {
        // your code here
        if(root==null){
            return root;
        }
        if(root.data>Key){
            root.left=delete(root.left,Key);
        }
        else if(root.data<Key){
            root.right=delete(root.right,Key);
        }

        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.data = minValue(root.right);

            root.right = delete(root.right, data)
        }
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